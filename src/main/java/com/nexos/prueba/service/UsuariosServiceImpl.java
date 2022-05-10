package com.nexos.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nexos.prueba.domain.Usuarios;
import com.nexos.prueba.repository.UsuariosRepository;

public class UsuariosServiceImpl implements UsuariosService{

	@Autowired
	UsuariosRepository usuariosRepository;
	
	@Override
	public List<Usuarios> listUsua() {
		// TODO Auto-generated method stub
		return usuariosRepository.listUsua();
	}

}
