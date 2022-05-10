package com.nexos.prueba.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int producodi;
	String nombprodu;
	Date feching;
	int usuacodi;

}
