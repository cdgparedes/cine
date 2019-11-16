package com.ceiba.cine.dominio.modelo.dto;

public class DtoPelicula {

	private String nombre;
	private String detalle;
	private String genero;

	public DtoPelicula() {
	}

	public DtoPelicula(String nombre, String detalle, String genero) {
		super();
		this.nombre = nombre;
		this.detalle = detalle;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}