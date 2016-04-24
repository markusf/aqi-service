package com.bluebird.aqi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bluebird.aqi.domain.AirQualityIndex;
import com.bluebird.aqi.service.AqiService;

@RestController
public class AqiResource {
	
	@Autowired
	private AqiService aqiService;
	
	@RequestMapping(value = "/aqi/{city}", method = RequestMethod.GET, produces = "application/json")
	public AirQualityIndex getAqi(@PathVariable String city) {
		
		AirQualityIndex aqi = aqiService.getByCity(city);
		
		return aqi;
	}
	
}
