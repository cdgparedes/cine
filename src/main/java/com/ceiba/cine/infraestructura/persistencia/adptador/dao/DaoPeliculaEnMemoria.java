package com.ceiba.cine.infraestructura.persistencia.adptador.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;
import com.ceiba.cine.infraestructura.persistencia.jpa.PeliculaJpa;
import com.ceiba.cine.infraestructura.persistencia.maper.PeliculaBuilder;

@Component
public class DaoPeliculaEnMemoria implements DaoPelicula {

	@Autowired
	private PeliculaJpa peliculaJpa;
	
	public DaoPeliculaEnMemoria(PeliculaJpa peliculaJpa) {
		this.peliculaJpa=peliculaJpa;
		
	}

	@Override
	public List<DtoPelicula> listar() {
		return PeliculaBuilder.convertirListaPeliculaEntityAPeliculasDto(peliculaJpa.findAll());
	}

	@Override
	public PeliculaEntity crear(Pelicula pelicula) {
		return peliculaJpa.save(PeliculaBuilder.convertirAEntidad(pelicula));
		
	}
	
	@Override
	public void actualizar(Pelicula pelicula) {
		//peliculaJpa.findById(id)
		PeliculaEntity peliculaEntidad=PeliculaBuilder.convertirAEntidad(pelicula);
		peliculaJpa.save(peliculaEntidad);
		
		
	}
	

	@Override
	public List<PeliculaEntity> obtenerXnombre(String nombre) {
		System.out.println("Nombre en el DAO"+nombre);
		return peliculaJpa.findByNombre(nombre);
	}
	
	@Override
	public void eliminarpelicula(Long id) {
		peliculaJpa.deleteById(id);
	}
}
