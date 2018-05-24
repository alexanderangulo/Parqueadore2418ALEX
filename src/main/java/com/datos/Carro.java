package com.datos;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Carro {
	private String placa;
	
	public Carro() {
	}
	
	public Carro(String placa) {
		
		this.placa = placa;
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}