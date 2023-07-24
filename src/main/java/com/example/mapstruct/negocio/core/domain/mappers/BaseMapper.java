package com.example.mapstruct.negocio.core.domain.mappers;

import org.mapstruct.MappingTarget;

public interface BaseMapper<Entity, DTOIn, DTOOut> {
	void updateEntidade(DTOIn dto, @MappingTarget Entity entidade);
	void updateDTO(Entity entidade, @MappingTarget DTOIn dto);
	Entity toEntidade(DTOIn dto);
	DTOOut toDto(Entity entidade);
}
