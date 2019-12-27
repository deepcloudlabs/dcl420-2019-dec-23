package com.example.world.service;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.example.world.client.dto.CityDTO;

@Stateless
public class WorldClientService {
	private static final String uri = "http://localhost:8080/world-rest-service-0.0.1-SNAPSHOT/api/v1/cities/200";

	@Schedule(hour = "*", minute = "*", second = "*")
	public void callRestApi() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
//		ByteArrayInputStream respStream = new ByteArrayInputStream(response.getBytes());
//		JsonObject jsonObject = Json.createReader(respStream).readObject();
//		jsonObject.entrySet()
//		          .forEach(entry -> {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		});
//		CityDTO cityDTO = new CityDTO(
//				jsonObject.getInt("id"),
//				jsonObject.getString("name"), 
//				jsonObject.getInt("population")
//			);
		CityDTO cityDTO = JsonbBuilder.create().fromJson(response, CityDTO.class);
		System.out.println(cityDTO);
	}
}

