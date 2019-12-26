package com.example.hr.client.app;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class WorldClientApp {
	private static final String existingResourceUri = "http://localhost:8080/world-rest-service/api/v1/countries/async2/TUR";

	public static void main(String[] args) throws InterruptedException, IOException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest requestForJson = HttpRequest.newBuilder().uri(URI.create(existingResourceUri))
				.header("Accept", "application/json").build();

		// Parallel Call
		IntStream.range(0, 10)
//		.parallel()
				.forEach(i -> client.sendAsync(requestForJson, HttpResponse.BodyHandlers.ofString())
						.thenApply(HttpResponse::body)
						.thenAccept(System.err::println).join())
				;
		TimeUnit.SECONDS.sleep(3600);
	}

}
