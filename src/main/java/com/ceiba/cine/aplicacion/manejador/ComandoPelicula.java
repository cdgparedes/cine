package com.ceiba.cine.aplicacion.manejador;

import java.io.Serializable;

public class ComandoPelicula implements Serializable {

	private String nombre;
	private String genero;
	private String detalle;

	public ComandoPelicula() {
		super();
	}

	public ComandoPelicula(String nombre, String genero, String detalle) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.detalle = detalle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
