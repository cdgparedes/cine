package com.ceiba.cine.aplicacion.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.cine.aplicacion.fabrica.FabricaPelicula;
import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.servicio.ServicioCrearPelicula;

@Component
public class ManejadorCrearPelicula {

	private final ServicioCrearPelicula servicioCrearPelicula;
	private final FabricaPelicula fabricaPelicula;
	
	public ManejadorCrearPelicula(ServicioCrearPelicula servicioCrearPelicula,FabricaPelicula fabricaPelicula) {
		this.servicioCrearPelicula = servicioCrearPelicula;
		this.fabricaPelicula = fabricaPelicula;
	}
	
	public void ejecutar(ComandoPelicula comandoPelicula) {
		Pelicula pelicula = this.fabricaPelicula.crear(comandoPelicula);
		DtoPelicula dtoPelicula = new DtoPelicula();
		dtoPelicula.setDetalle(pelicula.getDetalle());
		dtoPelicula.setGenero(pelicula.getGenero());
		dtoPelicula.setNombre(pelicula.getNombre());
		this.servicioCrearPelicula.ejecutar(dtoPelicula);
	}
	
}
