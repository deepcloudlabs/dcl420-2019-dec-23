package com.example.imdb.client.app;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.example.imdb.service.impl.InMemoryMovieService;
import com.example.imdb.service.impl.Movie;

public class ImdbClientApp {

	public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/imdb-soap-webservice/InMemoryMovieServiceService.wsdl");
        QName qName = new QName("http://impl.service.imdb.example.com/", "InMemoryMovieServiceService");
        Service service  = Service.create(url, qName);
        InMemoryMovieService inMemoryMovieService =
        		service.getPort(InMemoryMovieService.class);
        long start = System.currentTimeMillis();	
        IntStream.range(0, 1_000)
                 .parallel()
                 .forEach( i -> {
                	 Arrays.asList("Drama", "Comedy", "War", "History", "Romance", "Family")
                	       .parallelStream()
                	       .forEach( genre ->{
                	    	   Collection<Movie> movies = inMemoryMovieService.findAllMoviesByGenre(genre);
                	    	   System.err.print(movies.size());
                	       } );
        });
        long stop = System.currentTimeMillis();
        System.err.println();
        System.err.println((stop-start)+" ms.");
	}

}
