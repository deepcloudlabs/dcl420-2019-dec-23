package com.example.hr.resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.hr.entity.Employee;
import com.example.hr.service.impl.EmployeeService;

@Path("/employees")
@RequestScoped
public class EmployeeResource {
	@Inject
	private EmployeeService employeeSrv;

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

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addEmployee(Employee employee) {
		return Response.ok(employeeSrv.addEmployee(employee)).build();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateEmployee(Employee employee) {
		return Response.ok(employeeSrv.updateEmployee(employee)).build();
	}

}
