package com.ceiba.cine.infraestructura.persistencia.maper;

import java.util.ArrayList;
import java.util.List;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

public class PeliculaBuilder {

	public static List<DtoPelicula> convertirListaADominio(List<PeliculaEntity> listaPeliculaEntity) {
		List<DtoPelicula> listaPeliculas = new ArrayList<DtoPelicula>();
		
		for (PeliculaEntity peliculaEntity : listaPeliculaEntity) {
			listaPeliculas.add(convertirADominio(peliculaEntity));
		}
		
		return listaPeliculas;
	}
	
	public static DtoPelicula convertirADominio(PeliculaEntity peliculaEntity) {
		DtoPelicula dtoPelicula = new DtoPelicula();
		dtoPelicula.setNombre(peliculaEntity.getNombre());
		
		return dtoPelicula;
	}
}
