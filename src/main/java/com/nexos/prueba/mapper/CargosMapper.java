package com.nexos.prueba.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.nexos.prueba.domain.Cargos;
import com.nexos.prueba.dto.CargosDTO;

@Mapper
public interface CargosMapper {
	
	Cargos toEntity(CargosDTO dto);
	CargosDTO toDto(Cargos usuarios);
   List<Cargos> toEntityList (List<CargosDTO> dtos);
   List<CargosDTO> toDtoList (List<Cargos> usuarios);
}
