package com.TestUnitario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.Negocio.IngresoNegocio;
import com.Negocio.ParqueaderoNegocio;


@SpringBootTest
public class ParqueaderoTest {

	/*@Before 
	public void incializar() {
		private int numMaxCarro=20;
		private int numMaxMoto=10;
		
	}*/
	
	@Test
	public void DisponibilidadCarroTest() {
		//Arrange
		int numMaxCarro=20;
		ParqueaderoNegocio nparqueadero = new ParqueaderoNegocio();
		//Act
		boolean disponible =nparqueadero.disponibilidadParqueaderoCarros(numMaxCarro);
		
		//Assert
		
		assertTrue(disponible);
				
	}

	@Test
	public void DisponibilidadMotoTest() {
		//Arrange
		
		int numMaxMoto=10;
		ParqueaderoNegocio nparqueadero = new ParqueaderoNegocio();
		//Act
		boolean disponible =nparqueadero.disponibilidadParqueaderoMotos(numMaxMoto);
		
		//Assert
		
		assertTrue(disponible);
				
	}
}
