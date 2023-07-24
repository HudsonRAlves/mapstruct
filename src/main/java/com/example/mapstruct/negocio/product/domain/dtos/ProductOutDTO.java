package com.example.mapstruct.negocio.product.domain.dtos;

import lombok.Data;

@Data
public class ProductOutDTO {
	
	private String id;
	private String name;
	private Double price;
	private String active;

}
