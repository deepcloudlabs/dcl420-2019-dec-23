package com.example.imdb.service;

import java.util.stream.Collectors;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import com.example.imdb.service.impl.InMemoryMovieService;
import com.example.imdb.service.impl.InMemoryMovieServiceService;
import com.example.imdb.service.impl.Movie;

@Stateless
public class ImdbServiceClient {
	@WebServiceRef(type=InMemoryMovieService.class,
			value=InMemoryMovieServiceService.class)
	private InMemoryMovieService inMemoryMovieService;
	
	@Schedule(hour = "*", minute = "*", second = "*/10")
	public void callImdbWebService() {
		String comedyMovies = inMemoryMovieService.findAllMoviesByGenre("Comedy")
		     .stream().map(Movie::getTitle)
		         .collect(Collectors.joining(",", "[", "]"));
		System.out.println(comedyMovies);
	}
}
