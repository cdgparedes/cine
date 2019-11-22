package com.ceiba.cine.infraestructura.controlador;

//import java.time.LocalDate;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.cine.aplicacion.manejador.ComandoPelicula;
import com.ceiba.cine.aplicacion.manejador.ManejadorActualizarPelicula;
import com.ceiba.cine.aplicacion.manejador.ManejadorCrearPelicula;
import com.ceiba.cine.aplicacion.manejador.ManejadorEliminarPeliculas;
import com.ceiba.cine.aplicacion.manejador.ManejadorListarPeliculas;
import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

@RestController
@RequestMapping("/privada/peliculas")
public class ControladorPelicula {

	private final ManejadorListarPeliculas manejadorListarPeliculas;
	private final ManejadorCrearPelicula manejadorCrearPelicula;
	private final ManejadorActualizarPelicula manejadorActualizarPelicula;
	private final ManejadorEliminarPeliculas manejadorEliminarPeliculas;

	@Autowired
	public ControladorPelicula(ManejadorListarPeliculas manejadorListarPeliculas,
			ManejadorCrearPelicula manejadorCrearPelicula, ManejadorActualizarPelicula manejadorActualizarPelicula,ManejadorEliminarPeliculas manejadorEliminarPeliculas) {
		this.manejadorListarPeliculas = manejadorListarPeliculas;
		this.manejadorCrearPelicula = manejadorCrearPelicula;
		this.manejadorActualizarPelicula = manejadorActualizarPelicula;
		this.manejadorEliminarPeliculas = manejadorEliminarPeliculas;
	}

	@PostMapping("/crear-pelicula")
	@ResponseStatus(HttpStatus.CREATED)
	public PeliculaEntity crear(@RequestBody ComandoPelicula comandoUsuario) {
		return this.manejadorCrearPelicula.ejecutar(comandoUsuario);
	}

	@PutMapping("/actualizar-pelicula")
	@ResponseStatus(HttpStatus.OK)
	public void actualizar(@RequestBody ComandoPelicula comandoPelicula) {
		this.manejadorActualizarPelicula.ejecutar(comandoPelicula);
		
	}

	@GetMapping("/lista-peliculas")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Collection<DtoPelicula> listar() {
		return this.manejadorListarPeliculas.ejecutar();
	}
	
	@DeleteMapping("/eliminarPeliculas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void  eliminar(@PathVariable("id") Long id) {
		this.manejadorEliminarPeliculas.ejecutar(id);
	}

}
