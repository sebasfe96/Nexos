package com.nexos.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nexos.prueba.domain.Cargos;

@Repository
public interface CargosRepository extends JpaRepository<Cargos, Integer>{
	
	@Query(value = "select * from cargos ", nativeQuery = true)
	List<Cargos>listCarg();

}
