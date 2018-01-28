package com.weeraman.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigStarterApplication {
	
	String greeting;

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigStarterApplication.class, args);
	}
}
