package com.ceiba.cine.dominio.modelo.entidad;

import java.util.Date;

public class Pelicula {
	public Long id;
	public String nombre;
	public String genero;
	public String detalle;
	public Date fechaEstreno;
    //validaciones ,nombre,genero construir dentro del constructor
	public Pelicula(String nombre, String genero, String detalle,Date fechaEstreno) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.detalle = detalle;
		this.fechaEstreno = fechaEstreno;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
