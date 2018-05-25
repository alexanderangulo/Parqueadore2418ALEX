package com.datos;

public class Parqueadero {
	
	private int contadorCarros;
	private int contadorMotos;
	private int numMaxCarro;
	private int numMaxMoto;
	
	public Parqueadero(int contadorCarros, int contadorMotos,int numMaxCarro,int numMaxMoto) {
		this.contadorCarros = contadorCarros;
		this.contadorMotos = contadorMotos;
		this.numMaxCarro =numMaxCarro;
		this.numMaxMoto =numMaxMoto;
		
		
	}

	public Parqueadero() {
	}

	public int getNumMaxCarro() {
		return numMaxCarro;
	}

	public void setNumMaxCarro(int numMaxCarro) {
		this.numMaxCarro = numMaxCarro;
	}

	public int getNumMaxMoto() {
		return numMaxMoto;
	}

	public void setNumMaxMoto(int numMaxMoto) {
		this.numMaxMoto = numMaxMoto;
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
