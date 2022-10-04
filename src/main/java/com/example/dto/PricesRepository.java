package com.example.dto;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PricesRepository extends JpaRepository<Prices, Integer> {

	public BigDecimal getPrice(final Integer id);
	
	public List<BigDecimal> getAllPrices();
}
