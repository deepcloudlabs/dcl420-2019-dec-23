package com.example.world.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.world.entity.City;
import com.example.world.entity.Country;

@Produces(MediaType.APPLICATION_JSON)
public class CitiesResource {

	private final Country country;

	public CitiesResource(Country country) {
		this.country = country;
	} 
	
	@GET
	public List<City> getCities(){
		return country.getCities();
	}
}
