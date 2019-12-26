package com.example.world.resources;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.world.dao.WorldDao;
import com.example.world.entity.Country;

@Path("/countries")
@RequestScoped
public class CountryResource {
	@Inject private WorldDao worldDao;
	@Resource(lookup = "java:jboss/ee/concurrency/executor/default")
	private ManagedExecutorService managedExecutorSrv;
	
	@GET
	@Path("/sync/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSyncCountryByCode(@PathParam("code") String code) {
		Country country = worldDao.findCountryByCode(code);
		if (Objects.isNull(country))
			return Response.status(Response.Status.NOT_FOUND).entity("Country is not found!").build();
		return Response.ok(country).build();
	}
	
	@GET
	@Path("/sync/{code}/cities")
	@Produces(MediaType.APPLICATION_JSON)
	public CitiesResource getCountryCities(@PathParam("code") String code) {
		Country country = worldDao.findCountryByCode(code);
		return new CitiesResource(country);
	}
	
	@GET
	@Path("/sync/{code}/capital")
	@Produces(MediaType.APPLICATION_JSON)
	public CapitalResource getCountryCapital(@PathParam("code") String code) {
		Country country = worldDao.findCountryByCode(code);
		return new CapitalResource(country,worldDao);
	}
	
	@GET
	@Path("/async1/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public void getAsyncCountryByCode1(@Suspended AsyncResponse asyncResponse,@PathParam("code") String code) {
		
		managedExecutorSrv.submit(() ->{
			Country country = worldDao.findCountryByCode(code);
			if (Objects.isNull(country))
				asyncResponse.resume(Response.status(Response.Status.NOT_FOUND).entity("Country is not found!").build());
			asyncResponse.resume(Response.ok(country).build());
		});
	}
	
	@GET
	@Path("/async2/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public void getAsyncCountryByCode2(@Suspended AsyncResponse asyncResponse,@PathParam("code") String code) {
		
		CompletableFuture.supplyAsync(() ->{
			Country country = worldDao.findCountryByCode(code);
			if (Objects.isNull(country))
				return asyncResponse.resume(Response.status(Response.Status.NOT_FOUND).entity("Country is not found!").build());
			return asyncResponse.resume(Response.ok(country).build());
		},managedExecutorSrv);
	}
}
