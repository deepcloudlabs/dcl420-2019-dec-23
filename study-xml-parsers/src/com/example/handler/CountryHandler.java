package com.example.handler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.example.domain.Country;

public class CountryHandler extends DefaultHandler {
	private List<Country> countries = new ArrayList<>();
	private String field;
	private Country country;

	@Override
	public void startDocument() throws SAXException {
		System.err.println("Parsing is just started!");
		countries.clear();
	}

	@Override
	public void endDocument() throws SAXException {
		System.err.println("Parsing is just ended!");
		countries.forEach(System.out::println);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//		System.err.println("Opening tag: " + qName);
		this.field = qName;
		if ("country".equals(qName))
			this.country = new Country();
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
//		System.err.println("Closing tag: " + qName);
		if ("country".equals(qName))
			this.countries.add(this.country);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String value = String.copyValueOf(ch, start, length);
		if (Character.isWhitespace(ch[start]))
			return;
		switch (this.field) {
		case "code":
			this.country.setCode(value);
			break;
		case "name":
			this.country.setName(value);
			break;
		case "continent":
			this.country.setContinent(value);
			break;
		default:
			break;
		}
	}

}
