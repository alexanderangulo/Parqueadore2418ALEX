package com.datos;
import java.util.Calendar;
//import java.util.Date;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Moto {
	private int Cilindraje;
	private String Placa;
	private int ValorHM=500;
	private int ValorDM=4000;
	private Calendar HorasM;
	private Calendar DiasM;
	
	

	
	public Moto(int cilindraje, String placa, int valorHM, int valorDM, Calendar horasM, Calendar diasM) {
		super();
		Cilindraje = cilindraje;
		Placa = placa;
		ValorHM = valorHM;
		ValorDM = valorDM;
		HorasM = horasM;
		DiasM = diasM;
	}
	
	public int getCilindraje() {
		return Cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		Cilindraje = cilindraje;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public int getValorHM() {
		return ValorHM;
	}
	public void setValorHM(int valorHM) {
		ValorHM = valorHM;
	}
	public int getValorDM() {
		return ValorDM;
	}
	public void setValorDM(int valorDM) {
		ValorDM = valorDM;
	}
	public Calendar getHorasM() {
		return HorasM;
	}
	public void setHorasM(Calendar horasM) {
		HorasM = horasM;
	}
	public Calendar getDiasM() {
		return DiasM;
	}
	public void setDiasM(Calendar diasM) {
		DiasM = diasM;
	}
}
