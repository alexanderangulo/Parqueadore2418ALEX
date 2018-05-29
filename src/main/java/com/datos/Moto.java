package com.datos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moto {
	private long id;
	private int cilindraje;
	private String placa;
	
	public Moto() {
	}

	public Moto(long id, int cilindraje, String placa) {
		this.id = id;
		this.cilindraje = cilindraje;
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
	