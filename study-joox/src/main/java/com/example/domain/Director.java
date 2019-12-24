package com.example.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "director")
@XmlAccessorType(XmlAccessType.FIELD)
public class Director {
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "imdb")
	private String imdb;

	public Director() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	@Override
	public String toString() {
		return "Director [name=" + name + "]";
	}

}
