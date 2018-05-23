package com.datos;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class Ingreso {
	
	private int TipoVehiculo;
	private Date FechaIngre;
	private String Placa;
	
	
	
	public Ingreso(int tipoVehiculo, Date fechaIngre, String placa) {
		super();
		this.TipoVehiculo = tipoVehiculo;
		this.FechaIngre = fechaIngre;
		this.Placa = placa;
	}

	public int getTipoVehiculo() {
		return TipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}

	public Date getFechaIngre() {
		return FechaIngre;
	}

	public void setFechaIngre(Date fechaIngre) {
		FechaIngre = fechaIngre;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	

}
