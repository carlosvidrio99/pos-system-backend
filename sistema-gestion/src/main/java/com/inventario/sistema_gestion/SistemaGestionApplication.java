package com.inventario.sistema_gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaGestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaGestionApplication.class, args);
		System.out.println("¡Sistema de Gestión de Inventario iniciado con éxito!");
	}

}
