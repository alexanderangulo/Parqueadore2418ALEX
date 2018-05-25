package com.datos;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
@SpringBootApplication
public class Ingreso {
	

	
	private int tipoVehiculo;
	private Calendar fechaIngre;
	private String placa;
	private int cilindraje;

	public Ingreso() {
	}

	public Ingreso(int tipoVehiculo, Calendar fechaIngre, String placa, int cilindraje) {
		this.tipoVehiculo = tipoVehiculo;
		this.fechaIngre = fechaIngre;
		this.placa = placa;
	}


	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public Calendar getFechaIngre() {
		return fechaIngre;
	}

	public String getPlaca() {
		return placa;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public void setFechaIngre(Calendar fechaIngre) {
		this.fechaIngre = fechaIngre;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
