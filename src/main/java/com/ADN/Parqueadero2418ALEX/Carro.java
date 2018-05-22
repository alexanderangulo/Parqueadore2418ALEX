package com.ADN.Parqueadero2418ALEX;
import java.util.Calendar;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Carro {
	private String Placa;
	private int ValorHC=1000;
	private int ValorDC=8000;
	private Calendar HorasC;
	private Calendar DiasC;
	public Carro(String placa, int valorHC, int valorDC, Calendar horasC, Calendar diasC) {
		super();
		Placa = placa;
		ValorHC = valorHC;
		ValorDC = valorDC;
		HorasC = horasC;
		DiasC = diasC;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public int getValorHC() {
		return ValorHC;
	}
	public void setValorHC(int valorHC) {
		ValorHC = valorHC;
	}
	public int getValorDC() {
		return ValorDC;
	}
	public void setValorDC(int valorDC) {
		ValorDC = valorDC;
	}
	public Calendar getHorasC() {
		return HorasC;
	}
	public void setHorasC(Calendar horasC) {
		HorasC = horasC;
	}
	public Calendar getDiasC() {
		return DiasC;
	}
	public void setDiasC(Calendar diasC) {
		DiasC = diasC;
	}
	
	
	//Metodos
	

}
