package com.ceiba.cine.dominio.servicio;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;
import com.ceiba.cine.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

public class ServicioCrearPelicula {

	private static final String LA_PELICULA_YA_EXISTE_EN_EL_SISTEMA = "La pelicula ya existe en el sistema";
	
	private DaoPelicula daoPelicula;
	
	public ServicioCrearPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
		
	}
	
	public PeliculaEntity ejecutar(Pelicula pelicula) {
		return this.daoPelicula.crear(pelicula);
	}

}
