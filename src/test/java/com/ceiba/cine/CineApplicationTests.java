package com.ceiba.cine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ceiba.cine.dominio.servicio.ServicioListarPelicula;

@SpringBootTest
class CineApplicationTests {
	
	@Autowired
	private ServicioListarPelicula servicioListarPelicula;
	
	@Test
	public void probarPrecioEstreno() {
		// Arrange
		LocalDate fecha = LocalDate.now();
		int precioEsperado = 10000;
		
		// Act
		int resultado = servicioListarPelicula.calcularPrecio(fecha);
		
		// Assert
		assertEquals(resultado, precioEsperado);
	}
	
	@Test
	public void probarPrecioEstandar() {
		// Arrange
		LocalDate fecha = LocalDate.now();
		LocalDate manana = fecha.plusDays(1);
		int precioEsperado = 5000;
		
		// Act
		int resultado = servicioListarPelicula.calcularPrecio(manana);
		
		// Assert
		assertEquals(resultado, precioEsperado);
	}


}
