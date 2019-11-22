package com.ceiba.cine.aplicacion.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.cine.aplicacion.fabrica.FabricaPelicula;
import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.servicio.ServicioCrearPelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

@Component
public class ManejadorCrearPelicula {

	private final ServicioCrearPelicula servicioCrearPelicula;
	private final FabricaPelicula fabricaPelicula;
	
	public ManejadorCrearPelicula(ServicioCrearPelicula servicioCrearPelicula,FabricaPelicula fabricaPelicula) {
		this.servicioCrearPelicula = servicioCrearPelicula;
		this.fabricaPelicula = fabricaPelicula;
	}
	
	public PeliculaEntity ejecutar(ComandoPelicula comandoPelicula) {
		Pelicula pelicula = this.fabricaPelicula.crear(comandoPelicula);
		
		return this.servicioCrearPelicula.ejecutar(pelicula);
	}
	
}
