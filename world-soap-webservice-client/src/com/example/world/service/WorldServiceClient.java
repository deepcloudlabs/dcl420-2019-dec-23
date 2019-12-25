package com.example.world.service;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import com.example.world.dao.Country;
import com.example.world.dao.impl.InMemoryWorldDaoService;
import com.example.world.dao.impl.WorldDao;

@Stateless
public class WorldServiceClient {
	@WebServiceRef(type = WorldDao.class, value = InMemoryWorldDaoService.class)
	private WorldDao worldDao;

	@Schedule(hour = "*", minute = "*", second = "*/10")
	public void callWorldWebService() {
	 worldDao.findCountriesByContinent("Asia")
	            .stream()
	            .map(Country::getName)
				.forEach(System.out::println);
	}
}
