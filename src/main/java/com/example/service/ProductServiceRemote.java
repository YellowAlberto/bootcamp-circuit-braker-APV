package com.example.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.Prices;
import com.example.dto.Product;


@Service
public class ProductServiceRemote implements ProductServiceI{
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	@Override
	@CircuitBreaker(name ="prices-service", fallbackMethod = "fallBack")
	public Product getProduct(Integer id) {
		if(id != null) {
			Product producto = new Product();
			final Prices response = this.restTemplate.postForObject("http://localhost:8080/getProduct/" + id, null, Prices.class, id);
			producto.setProductId(response.getId());
			producto.setChannel(response.getDescription());
			producto.setServerPort(response.getCode_product());
			return producto;
		}else {
			return null;	
		}
	}


	@Override
	public Product postProduct(Integer id) {
		if(id != null) {
			Product producto = new Product();
			final Prices response = this.restTemplate.postForObject("http://localhost:8080/getProduct/" + id, null, Prices.class, id);
			producto.setProductId(response.getId());
			producto.setChannel(response.getDescription());
			producto.setServerPort(response.getCode_product());
			return producto;
		}else {
			return null;	
		}
	}
	
	
	public Product fallBack(String id, Throwable a) {
		Product producto = new Product();
		producto.setProductId(null);
		producto.setChannel(null);
		producto.setServerPort(null);
		return producto;
	}
}

