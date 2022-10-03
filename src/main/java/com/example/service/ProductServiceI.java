package com.example.service;

import com.example.dto.Product;

public interface ProductServiceI {

	public Product getProduct(Integer id);
	
	public Product postProduct(Integer id);
}
