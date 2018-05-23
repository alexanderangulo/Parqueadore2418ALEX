package com.datos;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Calendar;

@SpringBootApplication
public class Factura {

	private int tipoVehiculo;
	private String placa;
	private Calendar fechaIngre;
	private Calendar fechaSalida;
	private double costo;
	
	public Factura(int tipoVehiculo, String placa, Calendar fechaIngre, Calendar fechaSalida, double costo) {
		super();
		this.tipoVehiculo = tipoVehiculo;
		this.placa = placa;
		this.fechaIngre = fechaIngre;
		this.fechaSalida = fechaSalida;
		this.costo = costo;
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

	public Calendar getFechaIngre() {
		return fechaIngre;
	}

	public void setFechaIngre(Calendar fechaIngre) {
		this.fechaIngre = fechaIngre;
	}

	public Calendar getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Calendar fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	

	
}
	