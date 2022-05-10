package com.nexos.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nexos.prueba.domain.Producto;
import com.nexos.prueba.repository.ProductoRepository;

public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> listProd() {
		// TODO Auto-generated method stub
		return productoRepository.listProd();
	}

}
