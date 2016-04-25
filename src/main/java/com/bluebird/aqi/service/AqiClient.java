package com.bluebird.aqi.service;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface AqiClient {
	
	@RequestLine("GET /city/{city}")
	@Headers({"User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64; rv:45.0) Gecko/20100101 Firefox/45.0"})
	String getByCity(@Param("city") String city);
	
}
