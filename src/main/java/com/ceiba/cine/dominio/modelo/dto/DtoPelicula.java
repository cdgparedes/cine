package com.ceiba.cine.dominio.modelo.dto;

public class DtoPelicula {

	private String nombre;
	
	public DtoPelicula() {
	}

	public DtoPelicula(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}