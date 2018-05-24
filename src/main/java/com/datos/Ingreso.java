package com.datos;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
@SpringBootApplication
public class Ingreso {
	
	private int tipoVehiculo;
	private  Calendar fechaIngre;
	private String placa;
	
	
	
	public Ingreso() {
	}

	public Ingreso(int tipoVehiculo, Calendar fechaIngre, String placa) {
		this.tipoVehiculo = tipoVehiculo;
		this.fechaIngre = fechaIngre;
		this.placa = placa;
	}

	
	public  boolean validarDiaIngreso(Calendar fechaIngre, String placa) {
		return ((fechaIngre.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || fechaIngre.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)
				&& (placa.charAt(0) == "A".charAt(0))) ;
				
	}
	
		
	
	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Calendar getFechaIngre() {
		return fechaIngre;
	}

	public void setFechaIngre(Calendar fechaIngre) {
		this.fechaIngre = fechaIngre;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}



	

}
