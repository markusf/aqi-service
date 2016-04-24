package com.bluebird.aqi.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bluebird.aqi.domain.AirQualityIndex;

@Component
public class AqiService {
	
	@Autowired
	private AqiClient aqiClient;
	
	public AirQualityIndex getByCity(String city) {
		
		String html = aqiClient.getByCity(city);
				
		int pm25 = getPm25FromHtml(html);
		
		AirQualityIndex aqi = new AirQualityIndex();
		aqi.setPm25(pm25);
		
		return aqi;
	}
	
	private int getPm25FromHtml(String html) {
		Document document = Jsoup.parse(html);

		String extractedAqi = document.select(".aqiwgt-table-aqicell .aqivalue").text();
		
		if (extractedAqi == null || extractedAqi.isEmpty()) {
			throw new AqiNotFoundException();
		}
		
		return Integer.valueOf(extractedAqi);
	}
	
}
