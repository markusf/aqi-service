package com.bluebird.aqi.domain;

public class City {
	
	private String name;
	
	public City(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("city may not be empty");
		}
		
		this.name = name;
	}
	
}
