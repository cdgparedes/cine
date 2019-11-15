package com.ceiba.cine.aplicacion.manejador;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.ceiba.cine.dominio.ServicioListarPelicula;
import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;

@Component
public class ManejadorListarPeliculas {
	
	private ServicioListarPelicula servicioListarPelicula;
	
	public ManejadorListarPeliculas(ServicioListarPelicula servicioListarPelicula) {
		this.servicioListarPelicula = servicioListarPelicula;
	}
	
	public Collection<DtoPelicula> ejecutar() {
		return this.servicioListarPelicula.ejecutar();
	}
}