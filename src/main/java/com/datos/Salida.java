package com.datos;
import java.util.Calendar;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Salida {

	private Calendar FechaSalida;
	private Calendar  Duracion;
	
	
	
	

	public Salida(Calendar fechaSalida, Calendar duracion) {
		super();
		FechaSalida = fechaSalida;
		Duracion = duracion;
	}

	public Calendar getFechaSalida() {
		return FechaSalida;
	}

	public void setFechaSalida(Calendar fechaSalida) {
		FechaSalida = fechaSalida;
	}

	public Calendar getDuracion() {
		return Duracion;
	}

	public void setDuracion(Calendar duracion) {
		Duracion = duracion;
	}
	
	
	
}
