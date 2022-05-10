package com.nexos.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexos.prueba.domain.Cargos;
import com.nexos.prueba.repository.CargosRepository;

@Service
public class CargosServiceImpl implements CargosService{

	
	@Autowired
	CargosRepository cargosRepository;
	
	@Override
	public List<Cargos> listCarg() {
		// TODO Auto-generated method stub
		return cargosRepository.listCarg();
	}

}
