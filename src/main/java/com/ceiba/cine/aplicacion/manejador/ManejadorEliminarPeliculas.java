package com.ceiba.cine.aplicacion.manejador;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.servicio.ServicioEliminarPelicula;

@Component
public class ManejadorEliminarPeliculas {
	private ServicioEliminarPelicula servicioEliminarPelicula;
	
	public ManejadorEliminarPeliculas (ServicioEliminarPelicula servicioEliminarPelicula) {
		this.servicioEliminarPelicula=servicioEliminarPelicula;
	}
	public void ejecutar(Long id) {
		this.servicioEliminarPelicula.ejecutar(id);
	}

}
