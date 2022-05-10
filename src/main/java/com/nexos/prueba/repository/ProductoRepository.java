package com.nexos.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.nexos.prueba.domain.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	
	@Query(value = "select * from producto ", nativeQuery = true)
	List<Producto>listProd();

}
