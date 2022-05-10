package com.nexos.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nexos.prueba.domain.Producto;
import com.nexos.prueba.dto.ProductoDTO;
import com.nexos.prueba.mapper.ProductoMapper;
import com.nexos.prueba.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	ProductoMapper productoMapper;
	
	@GetMapping(value = "/prodList")
	public ResponseEntity<List<ProductoDTO>> prodCarg() throws Exception{
		
		try {
			List<Producto> productos = productoService.listProd();
			List<ProductoDTO> productoDTOs = productoMapper.toDtoList(productos);
			
			return ResponseEntity.ok(productoDTOs);
		}catch (Exception e) {
			System.out.println("ProductoController Exception in prodCarg : " + e);
			return ResponseEntity.ok(null);

		}
	}

}
