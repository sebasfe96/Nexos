package com.nexos.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nexos.prueba.domain.Usuarios;
import com.nexos.prueba.dto.UsuariosDTO;
import com.nexos.prueba.mapper.UsuariosMapper;
import com.nexos.prueba.service.UsuariosService;

@RequestMapping(value = "/api/usuarios")
@RestController
public class UsuariosController {
	
	@Autowired
	UsuariosService usuariosService;
	
	@Autowired(required = true)
	UsuariosMapper usuariosMapper;
	
	@GetMapping(value = "/usuaList")
	public ResponseEntity<List<UsuariosDTO>> usuaCarg() throws Exception{
		
		try {
			List<Usuarios> usuarios = usuariosService.listUsua();
			List<UsuariosDTO>usuariosDTOs = usuariosMapper.toDtoList(usuarios);
			
			return ResponseEntity.ok(usuariosDTOs);
		}catch (Exception e) {
			System.out.println("UsuariosController  Exception in usuaCarg : " + e);
			return ResponseEntity.ok(null);

		}
	}

}
