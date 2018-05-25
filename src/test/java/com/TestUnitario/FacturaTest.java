package com.TestUnitario;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import com.Negocio.FacturaNegocio;

import junit.framework.Assert;

public class FacturaTest {

	@Test
	public void calculaTiempoTest() {
		//Arrange
		Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
		Calendar fechaSalida = new GregorianCalendar(2018,4,28,15,25,56);
		FacturaNegocio nfactura = new FacturaNegocio();
		//Act
		String duracion =nfactura.calcularDuracion(fechaIngre,fechaSalida);
		//Assert
		Assert.assertEquals("1 3",duracion);
	}
	@Test
	public void calcularCostoCarroTest() {
		//Arrange
		
		int tipoVehiculo= 1;
		int cilindraje=-1;
		Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
		Calendar fechaSalida = new GregorianCalendar(2018,4,28,15,25,56);
		FacturaNegocio nfactura = new FacturaNegocio();

		//Act
		int costo =nfactura.calculoDcobro(tipoVehiculo,fechaIngre,fechaSalida,cilindraje);
		
		//Assert
		Assert.assertEquals(11000, costo);
	}
	@Test
	public void calcularCostoMotoTest() {
		//Arrange
		
		int tipoVehiculo= 2;
		int cilindraje=500;
		Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
		Calendar fechaSalida = new GregorianCalendar(2018,4,28,15,25,56);
		FacturaNegocio nfactura = new FacturaNegocio();

		//Act
		int costo =nfactura.calculoDcobro(tipoVehiculo,fechaIngre,fechaSalida,cilindraje);
		
		//Assert
		Assert.assertEquals(5500, costo);
	}
	@Test
	public void calcularCostoMotoCilindrajeMayorTest() {
		//Arrange
		
		int tipoVehiculo= 2;
		int cilindraje=600;
		Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
		Calendar fechaSalida = new GregorianCalendar(2018,4,28,15,25,56);
		FacturaNegocio nfactura = new FacturaNegocio();

		//Act
		int costo =nfactura.calculoDcobro(tipoVehiculo,fechaIngre,fechaSalida,cilindraje);
		
		//Assert
		Assert.assertEquals(7500, costo);
	}

}
