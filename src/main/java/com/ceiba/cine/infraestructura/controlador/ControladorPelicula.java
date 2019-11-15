package com.ceiba.cine.infraestructura.controlador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.cine.aplicacion.manejador.ManejadorListarPeliculas;
import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;

//import co.com.ceiba.tiquetes.cesar.grajales.dominio.Pelicula;

@RestController
@RequestMapping("/privada/peliculas")
public class ControladorPelicula {
	
	private final ManejadorListarPeliculas manejadorListarPeliculas;

	@Autowired
	public ControladorPelicula(ManejadorListarPeliculas manejadorListarPeliculas) {
		this.manejadorListarPeliculas = manejadorListarPeliculas;
	}
	
	@GetMapping("/lista-peliculas")
	public Collection<DtoPelicula> listar() {
		return this.manejadorListarPeliculas.ejecutar();
	}
	
	/*public ControladorPelicula(ManejadorListarPeliculas manejadorListarPeliculas) {
		this.manejadorListarPeliculas = manejadorListarPeliculas;
	}*/

	/*@RequestMapping(method=RequestMethod.GET)
	public Collection<DtoPelicula> listar() {
		return this.manejadorListarPeliculas.ejecutar();
	}*/
}
