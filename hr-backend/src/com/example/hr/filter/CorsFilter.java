package com.example.hr.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Request;
import javax.ws.rs.ext.Provider;

@Provider
public class CorsFilter implements ContainerResponseFilter, ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext containerRequestContext,
			ContainerResponseContext containerResponseContext) throws IOException {
		containerResponseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		containerResponseContext.getHeaders().add("Access-Control-Allow-Methods",
				"GET, POST, PUT, OPTIONS, HEAD, DELETE, PATCH");
		containerResponseContext.getHeaders().add("Access-Control-Allow-Headers",
				"origin, content-type, accept, authorization");
	}

	@Override
	public void filter(ContainerRequestContext containerRequestContext) throws IOException {
		Request request = containerRequestContext.getRequest();
		System.out.println(request.getMethod() + " -> " + containerRequestContext.getUriInfo().getPath());
	}

}
