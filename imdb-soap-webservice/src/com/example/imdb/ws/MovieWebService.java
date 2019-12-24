package com.example.imdb.ws;

import java.util.Collection;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;

import com.example.imdb.entity.Genre;
import com.example.imdb.entity.Movie;
import com.example.imdb.service.MovieService;

//@WebService
public class MovieWebService {
	//@Inject
	private MovieService movieSrv;

	@WebMethod(operationName = "getAllGenres")
	public Collection<Genre> findAllGenres() {
		return movieSrv.findAllGenres();
	}
	
	@WebMethod(operationName = "searchMoviesByGenre")
	public Collection<Movie> findAllMoviesByGenre(
			@WebParam(name = "genre",mode = Mode.IN)
			String genre){
		return movieSrv.findAllMoviesByGenre(genre);
	}

}
