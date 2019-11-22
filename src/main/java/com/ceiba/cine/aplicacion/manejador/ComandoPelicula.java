package com.ceiba.cine.aplicacion.manejador;

import java.io.Serializable;
import java.util.Date;

public class ComandoPelicula implements Serializable {
	private Long id;
	private String nombre;
	private String genero;
	private String detalle;
	private Date fechaEstreno;

	public ComandoPelicula() {
		
	}

	public ComandoPelicula(String nombre, String genero, String detalle, Date fechaEstreno) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.detalle = detalle;
		this.fechaEstreno = fechaEstreno;
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

	public Date getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	
	

}
