
package com.datos;
import java.util.Calendar;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Carro {
	private String placa;
	private int valorHC=1000;
	private int valorDC=8000;
	private Calendar horasC;
	private Calendar diasC;
	
	public Carro(String placa, int valorHC, int valorDC, Calendar horasC, Calendar diasC) {
		
		this.placa = placa;
		this.valorHC = valorHC;
		this.valorDC = valorDC;
		this.horasC = horasC;
		this.diasC = diasC;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getValorHC() {
		return valorHC;
	}

	public void setValorHC(int valorHC) {
		this.valorHC = valorHC;
	}

	public int getValorDC() {
		return valorDC;
	}

	public void setValorDC(int valorDC) {
		this.valorDC = valorDC;
	}

	public Calendar getHorasC() {
		return horasC;
	}

	public void setHorasC(Calendar horasC) {
		this.horasC = horasC;
	}

	public Calendar getDiasC() {
		return diasC;
	}

	public void setDiasC(Calendar diasC) {
		this.diasC = diasC;
	}
	
	
	
	//Metodos
	
	
	
	
	
	

}
