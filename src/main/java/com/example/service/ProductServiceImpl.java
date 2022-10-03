package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import com.example.dto.Product;

@Service
public class ProductServiceImpl implements ProductServiceI{
	
	@Autowired
	private Environment env;
	
	@Value("product.product-name")
	private String myValue;
	
	@Override
	public Product getProduct(Integer id) {	
		
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("GET");
		product.setServerPort(env.getProperty("local.server.port"));
		product.setProductName(myValue);
		return product;
	}
	
	
	
	@Override
	public Product postProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("POST");
		product.setServerPort(env.getProperty("local.server.port"));
		product.setProductName(myValue);
		return product;
	}
}
