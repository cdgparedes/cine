package com.ceiba.cine.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.cine.dominio.ServicioListarPelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;

@Configuration
public class ConfiguracionBean {
	
	@Bean
	public ServicioListarPelicula servicioListarPelicula(DaoPelicula daoPelicula) {
		return new ServicioListarPelicula(daoPelicula);
	}

}
