package com.bluebird.aqi.domain;

import java.io.Serializable;

public class AirQualityIndex implements Serializable {
	
	private int pm25;
	
	public AirQualityIndex() {
		// TODO Auto-generated constructor stub
	}

	public int getPm25() {
		return pm25;
	}

	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}

}
