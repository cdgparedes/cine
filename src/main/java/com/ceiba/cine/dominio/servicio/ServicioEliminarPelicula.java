package com.ceiba.cine.dominio.servicio;

import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;

public class ServicioEliminarPelicula {

    private DaoPelicula daoPelicula;
	
	public ServicioEliminarPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
		
	}
	public void ejecutar(Long id) {
		this.daoPelicula.eliminarpelicula(id);
			
	}
}
