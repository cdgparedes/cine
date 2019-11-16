package com.ceiba.cine.dominio.puerto.repositorio;

import com.ceiba.cine.dominio.modelo.entidad.Pelicula;

public interface RepositorioPelicula {

	void crear(Pelicula pelicula);
	
	boolean existe(Pelicula pelicula);
}
