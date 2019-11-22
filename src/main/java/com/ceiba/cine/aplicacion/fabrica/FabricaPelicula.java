package com.ceiba.cine.aplicacion.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.cine.aplicacion.manejador.ComandoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;

@Component
public class FabricaPelicula {
	public Pelicula crear(ComandoPelicula comandoPelicula) {
		return new Pelicula(comandoPelicula.getNombre(), comandoPelicula.getGenero(), comandoPelicula.getDetalle(),comandoPelicula.getFechaEstreno(),comandoPelicula.getPrecio());
	}
}
