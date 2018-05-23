package com.datos;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class Ingreso {
	
	private int tipoVehiculo;
	private Date fechaIngre;
	private String placa;
	
	
	
	
	public Ingreso(int tipoVehiculo, Date fechaIngre, String placa) {
		this.tipoVehiculo = tipoVehiculo;
		this.fechaIngre = fechaIngre;
		this.placa = placa;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Date getFechaIngre() {
		return fechaIngre;
	}

	public void setFechaIngre(Date fechaIngre) {
		this.fechaIngre = fechaIngre;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}



	

}
