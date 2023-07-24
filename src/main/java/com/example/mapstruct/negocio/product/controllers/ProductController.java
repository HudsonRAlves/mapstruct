package com.example.mapstruct.negocio.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapstruct.negocio.product.domain.dtos.ProductOutDTO;
import com.example.mapstruct.negocio.product.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/")
	public List<ProductOutDTO> getAll() {
		return service.getAll();
	}

}
