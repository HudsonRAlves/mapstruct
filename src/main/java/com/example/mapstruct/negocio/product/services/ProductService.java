package com.example.mapstruct.negocio.product.services;

import java.util.List;

import com.example.mapstruct.negocio.product.domain.dtos.ProductOutDTO;

public interface ProductService {
	List<ProductOutDTO> getAll(); 
}
