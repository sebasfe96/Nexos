package com.nexos.prueba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nexos.prueba.domain.Cargos;

@Service
public interface CargosService {
	
	List<Cargos>listCarg();

}
