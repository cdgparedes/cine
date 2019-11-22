package com.ceiba.cine.dominio.modelo.reglas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.servicio.ServicioListarPelicula;
import com.ceiba.cine.infraestructura.persistencia.maper.PeliculaBuilder;

public class AgregarPrecio {
	
	private ServicioListarPelicula servicioListarPelicula;
	
	private static final int PRECIO_ESTANDAR = 5000;
	private static final int PRECIO_ESTRENO = 10000;

	@Autowired
	public AgregarPrecio(ServicioListarPelicula servicioListarPelicula) {
		this.servicioListarPelicula = servicioListarPelicula;
	}
	
	public List<Pelicula> getListaPeliculas(){
		List<DtoPelicula> listaDto;
		listaDto = (List<DtoPelicula>) this.servicioListarPelicula.ejecutar();
		return PeliculaBuilder.convertirListaPeliculaDtoAPeliculaDominio(listaDto);
	}
	
	public List<Pelicula> asignarPrecioPeliculas(List<Pelicula> listaPeliculas){
		LocalDate fechaHoy = LocalDate.now();
		for (Pelicula pelicula : listaPeliculas) {
			if (pelicula.getFechaEstreno().equals(fechaHoy)) {
				// setter el precio de la pelicula estreno
				pelicula.setPrecio(PRECIO_ESTRENO);
			} else {
				// setter el precio de la pelicula estandar
				pelicula.setPrecio(PRECIO_ESTANDAR);
			}
		}
		return listaPeliculas;
	}

}
