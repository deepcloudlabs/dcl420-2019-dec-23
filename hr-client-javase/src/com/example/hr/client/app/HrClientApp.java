package com.example.hr.client.app;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class HrClientApp {
	private static final String existingResourceUri = "http://localhost:8080/hr-backend/api/v1/employees/1";
	private static final String nonExistingResourceUri = "http://localhost:8080/hr-backend/api/v1/employees/2";

	public static void main(String[] args) throws InterruptedException, IOException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest requestForJson = HttpRequest.newBuilder().uri(URI.create(existingResourceUri))
				.header("Accept", "application/json").build();
		HttpRequest requestForXml = HttpRequest.newBuilder().uri(URI.create(existingResourceUri))
				.header("Accept", "application/xml").build();
		HttpRequest[] requests = { requestForJson, requestForXml };

		// Parallel Call
		IntStream.range(0, 10).parallel()
				.forEach(i -> client.sendAsync(requests[i % 2], HttpResponse.BodyHandlers.ofString())
						.thenApply(HttpResponse::body).thenAccept(System.err::println));

		// NotFound
		HttpRequest badRequestForJson = HttpRequest.newBuilder().uri(URI.create(nonExistingResourceUri))
				.header("Accept", "application/json").build();
		HttpRequest badRequestForXml = HttpRequest.newBuilder().uri(URI.create(nonExistingResourceUri))
				.header("Accept", "application/xml").build();
		HttpResponse<String> response = client.send(badRequestForXml, HttpResponse.BodyHandlers.ofString());
		System.err.println(response.body());
		response = client.send(badRequestForJson, HttpResponse.BodyHandlers.ofString());
		System.err.println(response.body());
		TimeUnit.SECONDS.sleep(5);
	}

}
