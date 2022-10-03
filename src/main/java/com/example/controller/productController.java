package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Product;
import com.example.service.ProductServiceI;

@RestController()
public class productController {
	
	private final String URL = "/product";
	
	private ProductServiceI productServiceI;
	
	public productController(ProductServiceI productServiceI) {
		this.productServiceI = productServiceI;
	}
	
	@GetMapping(URL + "/{id}")
	public Product getProduct(final @PathVariable Integer id) {
		return productServiceI.getProduct(id);	
	}

	@PostMapping(URL + "/{id}")
	public Product postProduct(final @PathVariable Integer id) {
		return productServiceI.postProduct(id);	
	}
	
}
