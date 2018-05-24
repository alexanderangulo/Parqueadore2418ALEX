package com.Negocio;

import com.datos.Parqueadero;

public class NParqueadero {

	private static final boolean Gingreso = false;
	Parqueadero parqueadero =new Parqueadero();
	int contadorCarros =parqueadero.getContadorCarros();
	int contadorMotos =parqueadero.getContadorMotos();
	
	public void ContadorDCarros() {
		
		
			
		
	}
		
	
	
	
	public boolean disponibilidadParqueaderoAutos() {
	return (contadorCarros<=20);
	
	}
}

	
	
