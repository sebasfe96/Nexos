package com.nexos.prueba.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.nexos.prueba.domain.Producto;
import com.nexos.prueba.dto.ProductoDTO;

@Mapper
public interface ProductoMapper {

	Producto toEntity(ProductoDTO dto);
	ProductoDTO toDto(Producto usuarios);
   List<Producto> toEntityList (List<ProductoDTO> dtos);
   List<ProductoDTO> toDtoList (List<Producto> usuarios);
}
