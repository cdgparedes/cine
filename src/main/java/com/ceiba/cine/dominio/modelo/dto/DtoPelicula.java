package com.ceiba.cine.dominio.modelo.dto;

import java.time.LocalDate;
//import java.util.Date;

public class DtoPelicula {

	private String nombre;
	private String detalle;
	private String genero;
	private LocalDate fechaEstreno;
	private int precio;

	public DtoPelicula() {
	}

	public DtoPelicula(String nombre, String detalle, String genero, LocalDate fechaEstreno,int precio) {
		this.nombre = nombre;
		this.detalle = detalle;
		this.genero = genero;
		this.fechaEstreno = fechaEstreno;
		this.precio=precio;
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

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}