package com.nexos.prueba.dto;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    int usuacodi;
    String nombre;
	int edad;
	@JoinColumn(name = "cargcodi", referencedColumnName = "cargcodi", columnDefinition = "cargcodi")
	int cargcodi;

}
