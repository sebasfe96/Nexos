package com.nexos.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.prueba.domain.Cargos;
import com.nexos.prueba.dto.CargosDTO;
import com.nexos.prueba.mapper.CargosMapper;
import com.nexos.prueba.service.CargosService;

@RestController
@RequestMapping("/api/cargos")
public class CargosController {
	
	@Autowired
	CargosService cargosService;
	
	@Autowired(required = true)
	CargosMapper cargosMapper;
	
	@GetMapping("/cargList")
	public ResponseEntity<List<CargosDTO>> listCarg() throws Exception{
		
		try {
			List<Cargos> cargos = cargosService.listCarg();
			List<CargosDTO> cargosDTOs = cargosMapper.toDtoList(cargos);
			
			return ResponseEntity.ok(cargosDTOs);
		}catch (Exception e) {
			System.out.println("CargosController Exception in listCarg : " + e);
			return ResponseEntity.ok(null);

		}
	}

}
