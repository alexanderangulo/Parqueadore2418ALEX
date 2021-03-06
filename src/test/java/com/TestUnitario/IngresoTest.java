package com.TestUnitario;

import com.Negocio.*;
import com.datos.Ingreso;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IngresoTest {

	
	
	@Test
	public void ingresoCarrosTest (){
		//Arrange
		long id=1;
		int tipoVehiculo= 1;
		Calendar fechaIngre= Calendar.getInstance();
		String placa="ABC123";
		int cilindraje =-1;
		
		//Act
		Ingreso ingreso = new Ingreso(id, fechaIngre,tipoVehiculo,placa,cilindraje);
		
		//Assert
		Assert.assertNotNull(ingreso);
	}
	
	@Test
	public void verificarDiaNoPermitidoPlacaATest() {
		
		//Arrange
		String placa="ABC133";
		Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
		IngresoNegocio ningreso = new IngresoNegocio();
		
		//Act
		boolean diaNoPermitido = ningreso.validarDiaIngreso(fechaIngre, placa);

		//Assert
		assertTrue(diaNoPermitido);
	}
	
	@Test
	public void verificarDiaPermitidoPlacaATest() {
		//Arrange
				
				String placa="BAC133";
				Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
				IngresoNegocio ningreso = new IngresoNegocio();
					
		//Act
				boolean diaPermitido =ningreso.validarDiaIngreso(fechaIngre, placa);

		//Assert
				Assert.assertFalse(diaPermitido);
					
	
	}
}
