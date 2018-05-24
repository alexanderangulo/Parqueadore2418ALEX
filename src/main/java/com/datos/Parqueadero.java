package com.datos;

public class Parqueadero {
	
	private int contadorCarros;
	private int contadorMotos;
	
	public Parqueadero(int contadorCarros, int contadorMotos) {
		this.contadorCarros = contadorCarros;
		this.contadorMotos = contadorMotos;
	}

	public Parqueadero() {
	}

	public int getContadorCarros() {
		return contadorCarros;
	}

	public void setContadorCarros(int contadorCarros) {
		this.contadorCarros = contadorCarros;
	}

	public int getContadorMotos() {
		return contadorMotos;
	}

	public void setContadorMotos(int contadorMotos) {
		this.contadorMotos = contadorMotos;
	}

}
