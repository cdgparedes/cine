package com.ceiba.cine.dominio.puerto.dao;

import java.util.List;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;

public interface DaoPelicula {

	List<DtoPelicula> listar();
	
}