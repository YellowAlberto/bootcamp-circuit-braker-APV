package com.example.service;

import java.math.BigDecimal;
import java.util.List;

public interface PricesServiceI {
	public BigDecimal getPrice(Integer id);
	
	public List<BigDecimal> getAllPrices();
}
