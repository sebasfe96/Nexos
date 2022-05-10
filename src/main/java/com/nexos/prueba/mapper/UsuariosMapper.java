package com.nexos.prueba.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.nexos.prueba.domain.Usuarios;
import com.nexos.prueba.dto.UsuariosDTO;

@Mapper
public interface UsuariosMapper {

	Usuarios toEntity(UsuariosDTO dto);
    UsuariosDTO toDto(Usuarios usuarios);
   List<Usuarios> toEntityList (List<UsuariosDTO> dtos);
   List<UsuariosDTO> toDtoList (List<Usuarios> usuarios);
   
}
