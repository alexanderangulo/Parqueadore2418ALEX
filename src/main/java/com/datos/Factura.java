package com.datos;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Calendar;

@SpringBootApplication
public class Factura {

	private int TipoVehiculo;
	private String Placa;
	private Calendar FechaIngre;
	private Calendar FechaSalida;
	private double Costo;
	public Factura(int tipoVehiculo, String placa, Calendar fechaIngre, Calendar fechaSalida, double costo) {
		super();
		TipoVehiculo = tipoVehiculo;
		Placa = placa;
		FechaIngre = fechaIngre;
		FechaSalida = fechaSalida;
		Costo = costo;
	}
	public int getTipoVehiculo() {
		return TipoVehiculo;
	}
	public void setTipoVehiculo(int tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public Calendar getFechaIngre() {
		return FechaIngre;
	}
	public void setFechaIngre(Calendar fechaIngre) {
		FechaIngre = fechaIngre;
	}
	public Calendar getFechaSalida() {
		return FechaSalida;
	}
	public void setFechaSalida(Calendar fechaSalida) {
		FechaSalida = fechaSalida;
	}
	public double getCosto() {
		return Costo;
	}
	public void setCosto(double costo) {
		Costo = costo;
	}
	
	
}
