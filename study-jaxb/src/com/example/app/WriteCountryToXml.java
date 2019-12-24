package com.example.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.example.domain.City;
import com.example.domain.Country;

public class WriteCountryToXml {

	public static void main(String[] args) throws Exception {
		Country turkey = new Country("TUR", "Turkey", "Asia", 1, 2);
		City ankara = new City("1", "Ankara", turkey, 1);
		City istanbul = new City("2", "İstanbul", turkey, 1);
		turkey.setCapital(ankara);
		turkey.getCities().add(ankara);
		turkey.getCities().add(istanbul);
		JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(turkey, new File("resources","turkey.xml"));
	}

}
