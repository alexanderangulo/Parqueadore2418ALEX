package com.datos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	private long id;
	private String placa;
	
	public Carro() {
	}
	

	public Carro(long id, String placa) {
		this.id = id;
		this.placa = placa;
	}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}