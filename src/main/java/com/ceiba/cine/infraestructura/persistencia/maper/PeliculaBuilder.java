package com.ceiba.cine.infraestructura.persistencia.maper;

import java.util.ArrayList;
import java.util.List;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

public class PeliculaBuilder {

	/**
	 * Metodo que convierte una lista de peliculas Entity a Lista de peliculas DTO
	 * @param listaPeliculaEntity
	 * @return
	 */
	public static List<DtoPelicula> convertirListaPeliculaEntityAPeliculasDto(List<PeliculaEntity> listaPeliculaEntity) {
		List<DtoPelicula> listaPeliculas = new ArrayList<DtoPelicula>();
		for (PeliculaEntity peliculaEntity : listaPeliculaEntity) {
			listaPeliculas.add(convertirADominio(peliculaEntity));
		}
		return listaPeliculas;
	}
	
	/**
	 * Metodo que convierte una entidad a dominio
	 * 
	 * @param peliculaEntity
	 * @return dtoPelicula
	 */
	public static DtoPelicula convertirADominio(PeliculaEntity peliculaEntity) {
		DtoPelicula dtoPelicula = new DtoPelicula();
		dtoPelicula.setNombre(peliculaEntity.getNombre());
		dtoPelicula.setGenero(peliculaEntity.getGenero());
		dtoPelicula.setFechaEstreno(peliculaEntity.getFechaEstreno());
		dtoPelicula.setDetalle(peliculaEntity.getDetalle());

		return dtoPelicula;
	}

	/**
	 * Metodo que convierte una lista de peliculas DTO a Lista de peliculas del Dominio
	 * @param listaPeliclaDto
	 * @return
	 */
	public static List<Pelicula> convertirListaPeliculaDtoAPeliculaDominio(List<DtoPelicula> listaPeliclaDto) {
		List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		for (DtoPelicula peliculaDto : listaPeliclaDto) {
			listaPeliculas.add(convertirDeDtoADominioPelicula(peliculaDto));
		}
		return listaPeliculas;
	}
	
	/**
	 * Metodo que convierte una pelicula Dto A pelicula Dominio
	 * @param dtoPelicula
	 * @return
	 */
	public static Pelicula convertirDeDtoADominioPelicula(DtoPelicula dtoPelicula) {
		Pelicula pelicula = new Pelicula();
		pelicula.setNombre(dtoPelicula.getNombre());
		pelicula.setGenero(dtoPelicula.getGenero());
		pelicula.setFechaEstreno(dtoPelicula.getFechaEstreno());
		pelicula.setDetalle(dtoPelicula.getDetalle());

		return pelicula;
	}


	/**
	 * Metodo que convierte una entidad a un dto
	 * 
	 * @param dtoPelicula
	 * @return peliculaEntity
	 */
	public static PeliculaEntity convertirAEntidad(Pelicula pelicula) {
		PeliculaEntity peliculaEntity = new PeliculaEntity();
		peliculaEntity.setId(pelicula.getId());
		peliculaEntity.setNombre(pelicula.getNombre());
		peliculaEntity.setGenero(pelicula.getGenero());
		peliculaEntity.setDetalle(pelicula.getDetalle());
		peliculaEntity.setFechaEstreno(pelicula.getFechaEstreno());
		return peliculaEntity;
	}
}
