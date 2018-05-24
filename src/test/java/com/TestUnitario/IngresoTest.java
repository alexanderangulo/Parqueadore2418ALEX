package com.TestUnitario;

import com.datos.Ingreso;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IngresoTest {

	
	
	/*@Test
	public void ingresoCarrosTest (){
		//Arrange
		int tipoVehiculo= 1;
		Date fechaIngre= new Date();
		String placa="ABC123";
		
		//Act
		ingreso = jhgf;
		
		//Assert
		Assert.assertNotNull(ingreso);
	}
	*/
	@Test
	public void verificarDiaNoPermitidoPlacaATest() {
		
		//Arrange
		int tipoVehiculo= 1;
		String placa="ABC133";
		Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
		Ingreso ingreso = new Ingreso(tipoVehiculo, fechaIngre, placa);
		
		//Act
		boolean diaNoPermitido = ingreso.validarDiaIngreso(fechaIngre, placa);

		//Assert
		assertTrue(diaNoPermitido);
	}
	
	@Test
	public void verificarDiaPermitidoPlacaATest() {
		//Arrange
				int tipoVehiculo= 1;
				String placa="BAC133";
				Calendar fechaIngre = new GregorianCalendar(2018,4,27,13,24,56);
				Ingreso ingreso = new Ingreso(tipoVehiculo, fechaIngre, placa);
				
				//Act
				boolean diaPermitido = ingreso.validarDiaIngreso(fechaIngre, placa);

				//Assert
				Assert.assertFalse(diaPermitido);
					
	
	}
}
