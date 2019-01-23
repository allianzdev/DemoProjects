package com.aztech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDiscoveryApplication.class, args);
	}
}