package com.example.mapstruct.negocio.product.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapstruct.negocio.core.domain.entidades.Product;
import com.example.mapstruct.negocio.product.domain.dtos.ProductOutDTO;
import com.example.mapstruct.negocio.product.domain.mappers.ProductMapper;
import com.example.mapstruct.negocio.product.repositorys.ProductRepository;
import com.example.mapstruct.negocio.product.services.ProductService;

@Service
public class ProductServicePadrao implements ProductService{
	
	@Autowired
	private ProductRepository repository;

	@Autowired
	private ProductMapper mapper;

	@Override
	public List<ProductOutDTO> getAll() {
		
		Iterable<Product> listProducts = repository.findAll();
		
		List<ProductOutDTO> listProductsOutDto = new ArrayList<ProductOutDTO>();
		
		listProducts.forEach( x -> {
			listProductsOutDto.add(mapper.toDto(x));
		});
		
		return listProductsOutDto;
	}

}
