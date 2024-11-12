package com.mylogo.api_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApiServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceRegistryApplication.class, args);
	}

}
