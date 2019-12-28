package com.example.world.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.world.dao.WorldDao;
import com.example.world.entity.City;
import com.example.world.entity.Country;

@Produces(MediaType.APPLICATION_JSON)
public class CapitalResource {

	private final Country country;
	private final WorldDao worldDao;

	public CapitalResource(Country country, WorldDao worldDao) {
		this.country = country ;
		this.worldDao = worldDao;
	}
	
	@GET
	public City getCapital() {
		return worldDao.findCityById(country.getCapital());
	}
}
