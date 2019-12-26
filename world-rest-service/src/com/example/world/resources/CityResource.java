package com.example.world.resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.world.dao.CityDao;
import com.example.world.entity.City;

@Path("/cities")
@RequestScoped
public class CityResource {

	@Inject
	CityDao cityDao;

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public JsonObject getCityById(@PathParam("id") Integer id) {
		City city = cityDao.findCityById(id);
		return Json.createObjectBuilder().add("id", city.getId()).add("name", city.getName())
				.add("population", city.getPopulation()).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllCities() {
		List<City> cities = cityDao.findAllCities();
		return JsonbBuilder.newBuilder().build().toJson(cities); 
	}
}
