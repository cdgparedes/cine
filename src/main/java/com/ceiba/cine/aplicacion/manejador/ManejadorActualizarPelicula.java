package com.ceiba.cine.aplicacion.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.cine.aplicacion.fabrica.FabricaPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.servicio.ServicioActualizarPelicula;

@Component
public class ManejadorActualizarPelicula {
	
	private final ServicioActualizarPelicula servicioActualizarPelicula;
	private final FabricaPelicula fabricaPelicula;
		
	public ManejadorActualizarPelicula(ServicioActualizarPelicula servicioActualizarPelicula,FabricaPelicula fabricaPelicula) {
		this.servicioActualizarPelicula = servicioActualizarPelicula;
		this.fabricaPelicula =	fabricaPelicula;	
	}
	
	public void ejecutar(ComandoPelicula comandoPelicula) {
		Pelicula pelicula = this.fabricaPelicula.crear(comandoPelicula);
		
		this.servicioActualizarPelicula.ejecutar(pelicula);
		System.out.println("Esto es una prueba de pelicucla" + pelicula);		
		
	}
	
	
	
}
