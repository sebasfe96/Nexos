package com.nexos.prueba.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
@Entity
public class Usuarios implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    int usuacodi;
    String nombre;
	int edad;
	@JoinColumn(name = "cargcodi", referencedColumnName = "cargcodi", columnDefinition = "cargcodi")
	int cargcodi;
	

}
