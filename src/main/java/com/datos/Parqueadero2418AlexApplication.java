package com.datos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.logica", "com.datos"})
public class Parqueadero2418AlexApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Parqueadero2418AlexApplication.class, args);
	}

}
