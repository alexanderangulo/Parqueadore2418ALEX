package com.datos;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Moto {
	private int cilindraje;
	private String placa;
	

	public Moto(int cilindraje, String placa) {
		this.cilindraje = cilindraje;
		this.placa = placa;
	}


	public Moto() {
	}


	public int getCilindraje() {
		return cilindraje;
	}


	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
	