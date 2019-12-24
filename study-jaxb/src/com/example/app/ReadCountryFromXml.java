package com.example.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.example.domain.Country;

public class ReadCountryFromXml {

	public static void main(String[] args) throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Country country = (Country) unmarshaller.unmarshal(new File("resources","turkey.xml"));
		System.out.println(country);
		country.getCities().forEach(System.out::println);
	}

}
