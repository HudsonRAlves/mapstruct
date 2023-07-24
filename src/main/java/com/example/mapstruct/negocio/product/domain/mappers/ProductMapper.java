package com.example.mapstruct.negocio.product.domain.mappers;

import org.mapstruct.Mapper;

import com.example.mapstruct.negocio.core.domain.entidades.Product;
import com.example.mapstruct.negocio.core.domain.mappers.BaseMapper;
import com.example.mapstruct.negocio.product.domain.dtos.ProductOutDTO;

@Mapper
public interface ProductMapper extends BaseMapper<Product, ProductOutDTO, ProductOutDTO>{
}
