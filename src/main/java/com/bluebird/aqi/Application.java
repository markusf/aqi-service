package com.bluebird.aqi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bluebird.aqi.service.AqiClient;

import feign.Feign;

@SpringBootApplication
public class Application {
	
	@Bean
	public CommandLineRunner run() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... run) throws Exception {
				System.out.println("Started!");
			}
		};
	}
	
	@Bean
	public AqiClient buildAqiClient() {
		return Feign.builder().target(AqiClient.class, "http://aqicn.org");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
