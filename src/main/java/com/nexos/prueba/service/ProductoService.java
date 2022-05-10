package com.nexos.prueba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nexos.prueba.domain.Producto;

@Service
public interface ProductoService {
	
	List<Producto>listProd();

}
