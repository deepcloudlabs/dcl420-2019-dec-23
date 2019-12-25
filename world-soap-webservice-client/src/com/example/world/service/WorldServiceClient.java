package com.example.world.service;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import com.example.world.dao.impl.Country;
import com.example.world.dao.impl.InMemoryWorldDao;
import com.example.world.dao.impl.InMemoryWorldDaoService;

@Stateless
public class WorldServiceClient {
	@WebServiceRef(type = InMemoryWorldDao.class, value = InMemoryWorldDaoService.class)
	private InMemoryWorldDao inMemoryWorldDao;

	@Schedule(hour = "*", minute = "*", second = "*/10")
	public void callWorldWebService() {
	 inMemoryWorldDao.findCountriesByContinent("Asia")
	            .stream()
	            .map(Country::getName)
				.forEach(System.out::println);
	}
}
