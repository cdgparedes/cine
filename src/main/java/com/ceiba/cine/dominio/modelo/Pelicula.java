package com.ceiba.cine.dominio.modelo;

public class Pelicula{
	public String nombre;
	public String genero;
	public String detalle;

	public Pelicula(String nombre, String genero, String detalle) {
		// ValidadorArgumentos.validarVacios(nombre);
		// ValidadorArgumentos.validarVacios(genero);
		// ValidadorArgumentos.validarVacios(detalle);
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
