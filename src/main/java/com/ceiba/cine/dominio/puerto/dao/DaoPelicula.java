package com.ceiba.cine.dominio.puerto.dao;

import java.util.List;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

public interface DaoPelicula {

	List<DtoPelicula> listar();
	
	PeliculaEntity crear(Pelicula pelicula);
	
	void actualizar(Pelicula pelicula);
	
	List<PeliculaEntity> obtenerXnombre(String nombre);
	
	void eliminarpelicula(Long id);	
}