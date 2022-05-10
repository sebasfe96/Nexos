package com.nexos.prueba.domain;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "producto")
@Entity
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	int producodi;
	String nombprodu;
	Date feching;
	@JoinColumn(referencedColumnName = "usuacodi", name = "usuacodi", columnDefinition = "usuacodi")
	int usuacodi;

}
