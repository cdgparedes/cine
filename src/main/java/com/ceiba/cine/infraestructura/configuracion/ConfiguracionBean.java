package com.ceiba.cine.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;
import com.ceiba.cine.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cine.dominio.servicio.ServicioActualizarPelicula;
import com.ceiba.cine.dominio.servicio.ServicioCrearPelicula;
import com.ceiba.cine.dominio.servicio.ServicioEliminarPelicula;
import com.ceiba.cine.dominio.servicio.ServicioListarPelicula;

@Configuration
public class ConfiguracionBean {

	@Bean
	public ServicioListarPelicula servicioListarPelicula(DaoPelicula daoPelicula) {
		return new ServicioListarPelicula(daoPelicula);
	}

	@Bean
	public ServicioCrearPelicula servicioCrearPelicula(DaoPelicula daoPelicula) {
		return new ServicioCrearPelicula(daoPelicula);
	}
	
	@Bean
	public ServicioActualizarPelicula servicioActualizarPelicula(DaoPelicula daoPelicula) {
		return new ServicioActualizarPelicula(daoPelicula);
	}
	
	@Bean
	public ServicioEliminarPelicula servicioEliminarPelicula(DaoPelicula daoPelicula) {
		return new ServicioEliminarPelicula(daoPelicula);
	}

}
