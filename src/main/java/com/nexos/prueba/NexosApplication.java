package com.nexos.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nexos.prueba.mapper"})
public class NexosApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexosApplication.class, args);
	}

}
