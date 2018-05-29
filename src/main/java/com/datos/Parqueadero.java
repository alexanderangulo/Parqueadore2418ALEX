package com.datos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Parqueadero {
	
	private int contadorCarros;
	private int contadorMotos;

	List<Moto> idmoto=new ArrayList();
	List<Carro> idCarro=new ArrayList();
	

		
		
	public Parqueadero(int contadorCarros, int contadorMotos, List<Moto> idmoto, List<Carro> idCarro) {
		this.contadorCarros = contadorCarros;
		this.contadorMotos = contadorMotos;
		this.idmoto = idmoto;
		this.idCarro = idCarro;
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



	public List<Moto> getIdmoto() {
		return idmoto;
	}



	public void setIdmoto(List<Moto> idmoto) {
		this.idmoto = idmoto;
	}



	public List<Carro> getIdCarro() {
		return idCarro;
	}



	public void setIdCarro(List<Carro> idCarro) {
		this.idCarro = idCarro;
	}

	
}
