package com.bluebird.aqi.service;

import feign.Param;
import feign.RequestLine;

public interface AqiClient {
	
	@RequestLine("GET /city/{city}")
	String getByCity(@Param("city") String city);
	
}
