package com.example.app;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StudyDOMParser {
	private static final Map<String,Long> continentCountryNumbers= new HashMap<>();

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		factory.setValidating(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("resources", "countries.xml"));
		Node countryList = document.getDocumentElement();
		if (countryList.getNodeType() == Node.ELEMENT_NODE) {
			NodeList countries = countryList.getChildNodes();
			for (int i = 0; i < countries.getLength(); i++) {
				if (countries.item(i).getNodeType() == Node.ELEMENT_NODE) {
					NodeList country = countries.item(i).getChildNodes();
					for (int j = 0; j < country.getLength(); j++) {
						if (country.item(j).getNodeName().compareTo("continent") == 0) {
							NodeList countryContinent = country.item(j).getChildNodes();
							for (int k = 0; k < countryContinent.getLength(); k++) {
								if (countryContinent.item(k).getNodeType() == Node.TEXT_NODE) {
									String continent = countryContinent.item(k).getNodeValue();
									Long count = continentCountryNumbers.get(continent);
									if (count==null) count=0L;
									count = count + 1;
									continentCountryNumbers.put(continent, count);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(continentCountryNumbers);
	}

}
