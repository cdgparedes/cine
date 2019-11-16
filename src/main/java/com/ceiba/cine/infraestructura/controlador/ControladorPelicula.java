package com.ceiba.cine.infraestructura.controlador;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.cine.aplicacion.manejador.ComandoPelicula;
import com.ceiba.cine.aplicacion.manejador.ManejadorCrearPelicula;
import com.ceiba.cine.aplicacion.manejador.ManejadorListarPeliculas;
import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;

@RestController
@RequestMapping("/privada/peliculas")
public class ControladorPelicula {

	private final ManejadorListarPeliculas manejadorListarPeliculas;
	private final ManejadorCrearPelicula manejadorCrearPelicula;

	@Autowired
	public ControladorPelicula(ManejadorListarPeliculas manejadorListarPeliculas,
			ManejadorCrearPelicula manejadorCrearPelicula) {
		this.manejadorListarPeliculas = manejadorListarPeliculas;
		this.manejadorCrearPelicula = manejadorCrearPelicula;
	}

	@PostMapping("/crear-pelicula")
	@ResponseStatus(HttpStatus.CREATED)
	public void crear(@RequestBody ComandoPelicula comandoUsuario) {
		this.manejadorCrearPelicula.ejecutar(comandoUsuario);
	}

	@GetMapping("/lista-peliculas")	
	@ResponseStatus(HttpStatus.OK)
	public Collection<DtoPelicula> listar() {
		return this.manejadorListarPeliculas.ejecutar();
	}

}
