package com.negocio;

import com.datos.Parqueadero;

public class ParqueaderoNegocio {

	Parqueadero parqueadero =new Parqueadero();
	int contadorCarros =parqueadero.getContadorCarros();
	int contadorMotos =parqueadero.getContadorMotos();
	
	public int contadorDCarros(int tipoVehiculo,boolean vIngreso,boolean vFactura) {//registro de ingreso ,registro de factura
		if ((vIngreso==true) && (tipoVehiculo==1)) {
		contadorCarros= ++contadorCarros;
		}else if ((vFactura==true) && (tipoVehiculo==1)) {
		contadorCarros= --contadorCarros;
		}
						
	return contadorCarros;
	}
		
	public int contadorDMotos(int tipoVehiculo,boolean vIngreso,boolean vFactura) {
		if ((vIngreso==true) && (tipoVehiculo==2)) {
			contadorMotos= ++contadorMotos;			
		}else if ((vFactura==true) && (tipoVehiculo==2)) {
			contadorMotos= ++contadorMotos;			
		}
		
	return contadorMotos;
	}
			
				 
		public boolean disponibilidadParqueaderoCarros(int numMaxCarro) {
			return (contadorCarros<=numMaxCarro);
	}
		
	
	
		public boolean disponibilidadParqueaderoMotos(int numMaxMoto) {
			return (contadorMotos<=numMaxMoto);
	}
		
	
		
	
	
	
	
	
	


}