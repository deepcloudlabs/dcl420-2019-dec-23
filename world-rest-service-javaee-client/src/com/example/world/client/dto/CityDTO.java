package com.example.world.client.dto;

public class CityDTO {
	private int id;
	private String name;
	private long population;

	public CityDTO() {
	}

	public CityDTO(int id, String name, long population) {
		this.id = id;
		this.name = name;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "CityDTO [id=" + id + ", name=" + name + ", population=" + population + "]";
	}

}