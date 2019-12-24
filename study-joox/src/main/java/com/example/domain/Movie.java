package com.example.domain;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "movie")
public class Movie {
	private String title;
	private String imdb;
	private Integer year;
	private Collection<Director> directors;
	private Collection<String> genres;

	public Movie() {
	}

	@XmlElement(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlAttribute(name="imdb")
	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	@XmlElement(name="year")
	// @XmlTransient
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@XmlElementWrapper
	@XmlElementRefs({
		@XmlElementRef(type=Director.class)
	})	
	public Collection<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(Collection<Director> directors) {
		this.directors = directors;
	}

	@XmlElementWrapper(name="genres")
	@XmlElement(name="genre")
	public Collection<String> getGenres() {
		return genres;
	}

	public void setGenres(Collection<String> genres) {
		this.genres = genres;
	}

}
