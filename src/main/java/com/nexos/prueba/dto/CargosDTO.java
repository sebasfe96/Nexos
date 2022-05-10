package com.nexos.prueba.dto;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CargosDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	Long cargcodi;
	String nombcarg;

}
