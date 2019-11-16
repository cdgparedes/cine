package com.ceiba.cine.dominio.servicio;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;
import com.ceiba.cine.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioCrearPelicula {

	private static final String LA_PELICULA_YA_EXISTE_EN_EL_SISTEMA = "La pelicula ya existe en el sistema";
	
	//private RepositorioPelicula repositorioPelicula;
	private DaoPelicula daoPelicula;
	
	public ServicioCrearPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	public void ejecutar(DtoPelicula dtoPelicula) {
		/*validarExistenciaPrevia(pelicula);
		this.repositorioPelicula.crear(pelicula);*/
		this.daoPelicula.crear(dtoPelicula);
	}

	/*private void validarExistenciaPrevia(Pelicula pelicula) {
		boolean existe = this.repositorioPelicula.existe(pelicula);
		if(existe) {
			//throw new ExcepcionDuplicidad(LA_PELICULA_YA_EXISTE_EN_EL_SISTEMA);
		}
	}*/
}
