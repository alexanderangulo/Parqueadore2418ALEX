package com.ADN.Parqueadero2418ALEX;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Calendar;

@SpringBootApplication
public class Ingreso {
	
	private int TipoVehiculo;
	private Calendar FechaIngre;
	private String Placa;
	
	public Ingreso(int tipoVehiculo, Calendar fechaIngre, String placa) {
		super();
		TipoVehiculo = tipoVehiculo;
		FechaIngre = fechaIngre;
		Placa = placa;
	}

	public int getTipoVehiculo() {
		return TipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}

	public Calendar getFechaIngre() {
		return FechaIngre;
	}

	public void setFechaIngre(Calendar fechaIngre) {
		FechaIngre = fechaIngre;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	

}
