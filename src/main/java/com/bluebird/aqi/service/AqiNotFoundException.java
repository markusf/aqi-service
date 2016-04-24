package com.bluebird.aqi.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AqiNotFoundException extends RuntimeException {

	public AqiNotFoundException() {
		super("Aqi not found");
	}
	
}
