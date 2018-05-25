package com.TestUnitario;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.negocio.ParqueaderoNegocio;


@SpringBootTest
public class ParqueaderoTest {


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
