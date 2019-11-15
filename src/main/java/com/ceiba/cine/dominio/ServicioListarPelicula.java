package com.ceiba.cine.dominio;

import java.util.Collection;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;

public class ServicioListarPelicula {

	private DaoPelicula daoPelicula;
	
	public ServicioListarPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	public Collection<DtoPelicula> ejecutar() {
		return this.daoPelicula.listar();
	}	

}
