package com.example.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Prices;
import com.example.dto.PricesRepository;

@Service
public class PricesServiceImpl implements PricesServiceI {
	
	@Autowired
	private PricesRepository priceRepository;

	@Override
	public BigDecimal getPrice(Integer id) {
		BigDecimal precio = new BigDecimal("0");
		precio = priceRepository.findById(id).get().getPrice();
		return precio;
	}

	@Override
	public List<BigDecimal> getAllPrices() {
		List<Prices> listaPrecios = priceRepository.findAll();
		List<BigDecimal> precios = new ArrayList<BigDecimal>();
		for(Prices p : listaPrecios) {
			BigDecimal precio = p.getPrice();
			precios.add(precio);
		}
		return precios;
	}

}
