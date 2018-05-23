package com.TestUnitario;

import com.datos.Ingreso;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IngresoTest {

	
	@Test
	public void ingresoCarrosTest (){
		//Arrange
		int tipoVehiculo= 1;
		Date fechaIngre= new Date();
		String placa="ABC123";
		
		//Act
		Ingreso ingreso = new Ingreso(tipoVehiculo, fechaIngre, placa);
		
		//Assert
		Assert.assertNotNull(ingreso);
	}
	
	
	
	
	
	
	
}
