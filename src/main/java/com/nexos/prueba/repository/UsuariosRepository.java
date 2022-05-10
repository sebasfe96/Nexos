package com.nexos.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.nexos.prueba.domain.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer>{
	
	@Query(value = "select * from usuarios ", nativeQuery = true)
	List<Usuarios>listUsua();

}
