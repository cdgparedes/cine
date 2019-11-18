package com.ceiba.cine.infraestructura.persistencia.adptador.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;
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
		return PeliculaBuilder.convertirListaADominio(peliculaJpa.findAll());
	}

	@Override
	public void crear(DtoPelicula dtoPelicula) {
		peliculaJpa.save(PeliculaBuilder.convertirAEntidad(dtoPelicula));
		
	}

}
