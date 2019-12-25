package com.example.world.client.app;

import java.net.URL;
import java.util.function.Consumer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.example.world.dao.impl.InMemoryWorldDao;

public class WorldClientApp {

	public static void main(String[] args) throws Exception {
        URL url = new URL("file:/C:/temp/InMemoryWorldDaoService.wsdl");
        QName qName = new QName("http://impl.dao.world.example.com/", "InMemoryWorldDaoService");
        Service service  = Service.create(url, qName);
        InMemoryWorldDao inMemoryWorldDao = service.getPort(InMemoryWorldDao.class);
        Consumer<String> findCountries = inMemoryWorldDao::findCountriesByContinent;
        Consumer<String> printCountries = System.out::println;
		inMemoryWorldDao.getAllContinents()
                        .forEach(findCountries.andThen(printCountries)); 
        
	}

}
