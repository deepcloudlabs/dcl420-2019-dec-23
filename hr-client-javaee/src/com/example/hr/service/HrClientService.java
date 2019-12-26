package com.example.hr.service;

import java.util.concurrent.CompletableFuture;

import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Stateless
public class HrClientService {
	private static final String uri = "http://localhost:8080/hr-backend/api/v1/employees/1";
	private static int counter = 0;
	private static String mediaTypes[] = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML };
	@Resource
	private ManagedExecutorService mes;

	@Schedule(hour = "*", minute = "*", second = "*")
	public void callRestApi() {
		CompletableFuture.supplyAsync(() -> {
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(uri);
			String response = target.request(mediaTypes[counter++ % 2]).get(String.class);
			return response;
		}, mes).thenAccept(System.out::println);
	}
}
