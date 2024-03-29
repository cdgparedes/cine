package com.ceiba.cine.dominio.modelo.entidad;

import java.time.LocalDate;

public class Pelicula {
	public Long id;
	public String nombre;
	public String genero;
	public String detalle;
	public LocalDate fechaEstreno;
	public int precio;
    //validaciones ,nombre,genero construir dentro del constructor
	
	
	
	public Pelicula(String nombre, String genero, String detalle, LocalDate fechaEstreno,int precio) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.detalle = detalle;
		this.fechaEstreno = fechaEstreno;
		this.precio=precio;
	}
	
	public Pelicula() {//modelos anemicos 
		super();
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
