package com.toures.balon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories
@EnableDiscoveryClient
@SpringBootApplication
public class TouresBalonProveedorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouresBalonProveedorApplication.class, args);
	}

}
