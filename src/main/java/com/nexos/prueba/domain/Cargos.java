package com.nexos.prueba.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cargos")
@Entity
public class Cargos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	Long cargcodi;
	String nombcarg;
	

}
