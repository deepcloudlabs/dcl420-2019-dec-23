package com.example.domain;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="collection")
public class MovieCollection {
	private Collection<Movie> movies;

	public MovieCollection() {
	}

	@XmlElementWrapper
	@XmlElementRefs({
		@XmlElementRef(type=Movie.class)
	})
	public Collection<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Collection<Movie> movies) {
		this.movies = movies;
	}
	
	
}
