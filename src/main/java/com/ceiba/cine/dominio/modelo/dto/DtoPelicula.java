package com.ceiba.cine.dominio.modelo.dto;

import java.util.Date;

public class DtoPelicula {

	private String nombre;
	private String detalle;
	private String genero;
	private Date fechaEstreno;
	private int precio;

	public DtoPelicula() {
	}

	public DtoPelicula(String nombre, String detalle, String genero, Date fechaEstreno,int precio) {
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

	public Date getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}