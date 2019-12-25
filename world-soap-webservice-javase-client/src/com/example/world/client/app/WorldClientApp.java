package com.example.world.client.app;

import java.net.URL;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.example.world.dao.Country;
import com.example.world.dao.impl.WorldDao;

public class WorldClientApp {

	public static void main(String[] args) throws Exception {
        URL url = new URL("file:./resources/InMemoryWorldDaoService.wsdl");
        QName qName = new QName("http://impl.dao.world.example.com/", "InMemoryWorldDaoService");
        Service service  = Service.create(url, qName);
        WorldDao inMemoryWorldDao = service.getPort(WorldDao.class);
        Function<String,Collection<Country>> findCountries = inMemoryWorldDao::findCountriesByContinent;
        Consumer<Country> printCountry = country -> System.out.println(String.format("%3s %-36s %-12d %-12.1f", country.getCode(), country.getName(),country.getPopulation(),country.getSurfaceArea()));
		inMemoryWorldDao.getAllContinents()
						.stream()
                        .map(findCountries)
                        .flatMap(Collection::stream)
                        .filter(country -> country.getPopulation() > 0)
                        .sorted(Comparator.comparing(Country::getPopulation).reversed())
                        .forEach(printCountry); 
        
	}

}
