package com.datos;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ingreso {
	

	private long id;
	private Calendar fechaIngre;
	private int tipoVehiculo;
	private String placa;
	private int cilindraje;

	public Ingreso() {
	}

	


	public Ingreso(long id, Calendar fechaIngre, int tipoVehiculo, String placa, int cilindraje) {
		this.id = id;
		this.fechaIngre = fechaIngre;
		this.tipoVehiculo = tipoVehiculo;
		this.placa = placa;
		this.cilindraje = cilindraje;
	}


@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Calendar getFechaIngre() {
		return fechaIngre;
	}


	public void setFechaIngre(Calendar fechaIngre) {
		this.fechaIngre = fechaIngre;
	}


	public int getTipoVehiculo() {
		return tipoVehiculo;
	}


	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getCilindraje() {
		return cilindraje;
	}


	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}




	
	

}
