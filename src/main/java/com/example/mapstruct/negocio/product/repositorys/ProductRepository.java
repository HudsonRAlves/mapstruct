package com.example.mapstruct.negocio.product.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.example.mapstruct.negocio.core.domain.entidades.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	
}
