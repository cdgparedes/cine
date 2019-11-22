package com.ceiba.cine.dominio.servicio;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;

public class ServicioListarPelicula {

	private DaoPelicula daoPelicula;
	
	public ServicioListarPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	/*public Collection<DtoPelicula> ejecutar() {
		return this.daoPelicula.listar();;
	}*/	
	
	
	public Collection<DtoPelicula> ejecutar() {
		List<DtoPelicula> res=this.daoPelicula.listar();
		asignarPrecio(res);
		return res;
	}
	public void  asignarPrecio(List<DtoPelicula> lista) {
	DtoPelicula pelicula;
		for (int i = 0; i < lista.size(); i++) {
			pelicula=lista.get(i);
			int precio=calcularPrecio(pelicula.getFechaEstreno());
			pelicula.setPrecio(precio);
		}
	}
	
	
	public int calcularPrecio(Date fecha) {
		System.out.println(" fecha " + fecha );
		if (fecha.before(new Date())) {
			return 10000;
		}
		else {
		return 5000;
		
		}
	}

}
