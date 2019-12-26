package com.example.hr.resources;

import static java.util.Objects.nonNull;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.sse.OutboundSseEvent;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseBroadcaster;
import javax.ws.rs.sse.SseEventSink;

import com.example.hr.entity.Employee;
import com.example.hr.service.impl.EmployeeService;

@Path("/employees")
@Singleton
public class EmployeeResource {
	@Inject
	private EmployeeService employeeSrv;
	private SseBroadcaster sseBroadcaster;
	private Map<String, SseEventSink> eventSinks = new ConcurrentHashMap<>();

	// http://localhost:8080/hr-backend/api/v1/employees/1
	@GET
	@Path("{identity}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getEmployeeById(@PathParam("identity") String identity) {
		return Response.ok(employeeSrv.findEmployeeByIdentity(identity)).build();
	}

	@GET
	@Path("/alternative/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeById2(@PathParam("id") Long id) {
		return employeeSrv.findEmployeeById(id);
	}

	// http://localhost:8080/hr-backend/api/v1/employees?page=0&size=10
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Employee> getEmployees(@QueryParam("page") Integer page, @QueryParam("size") Integer size) {
		return employeeSrv.findEmployees(page, size);
	}

	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeEmployeeById(@PathParam("id") Long id) {
		return Response.ok(employeeSrv.deleteEmployeeById(id)).build();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateEmployee(Employee employee) {
		return Response.ok(employeeSrv.updateEmployee(employee)).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addEmployee(Employee employee, @Context Sse sse) {
		Employee emp = employeeSrv.addEmployee(employee);
		OutboundSseEvent event = sse.newEventBuilder().name("hr").id(emp.getId().toString())
				.mediaType(MediaType.APPLICATION_JSON_TYPE).data(Employee.class, emp).reconnectDelay(3_000)
				.comment("new employee is created!").build();
		// multicast
		this.sseBroadcaster.broadcast(event);
		// p2p
		SseEventSink sseEventSink = eventSinks.get("jack");
		if (nonNull(sseEventSink))
			sseEventSink.send(event);
		return Response.ok(emp).build();
	}

	// /api/v1/employees/subscribe?user=jack
	@GET
	@Produces(MediaType.SERVER_SENT_EVENTS)
	@Path("/subscribe")
	public void subscribe(@Context final SseEventSink eventSink, @Context Sse sse, @QueryParam("user") String user) {
		System.err.println("New subscriber has arrived!");
		eventSinks.put(user, eventSink);
		synchronized (this) {
			if (this.sseBroadcaster == null)
				this.sseBroadcaster = sse.newBroadcaster();
		}
		this.sseBroadcaster.register(eventSink);
	}
}
