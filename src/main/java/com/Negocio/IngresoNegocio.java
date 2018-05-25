package com.negocio;
import com.datos.*;
import java.util.Calendar;

public class IngresoNegocio {
	
/*	public static final boolean vIngreso;
	public static final boolean vFactura;
	
	Ingreso ingreso = new Ingreso();
	int tipoVehiculo= ingreso.getTipoVehiculo();
	Parqueadero parqueadero = new Parqueadero();
	int numMaxCarro= parqueadero.getNumMaxCarro();
	int numMaxMoto= parqueadero.getNumMaxMoto();
	ParqueaderoNegocio nparqueadero = new ParqueaderoNegocio();
	boolean disponibleCarro =nparqueadero.disponibilidadParqueaderoCarros(numMaxCarro);
	boolean disponibleMoto =nparqueadero.disponibilidadParqueaderoMotos(numMaxMoto);
	public void registro() {
	if (ingreso!= null) {
	int contadorCarro = nparqueadero.contadorDCarros(tipoVehiculo,vIngreso,vFactura);
	int contadorMoto = nparqueadero.contadorDMotos(tipoVehiculo,vIngreso,vFactura);
	
	}
	}*/
	
	public  boolean validarDiaIngreso(Calendar fechaIngre, String placa) {
	return ((fechaIngre.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY 
			|| fechaIngre.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)
				&& (placa.charAt(0) == "A".charAt(0))) ;
				
	}
	

}
