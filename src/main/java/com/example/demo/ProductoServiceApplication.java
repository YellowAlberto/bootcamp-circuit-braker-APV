package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductoServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ProductoServiceApplication.class, args);
	}

}
