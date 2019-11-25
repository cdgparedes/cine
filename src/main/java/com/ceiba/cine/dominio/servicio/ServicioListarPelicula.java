package com.ceiba.cine.dominio.servicio;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import com.ceiba.cine.dominio.modelo.dto.DtoPelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;

public class ServicioListarPelicula {

	private DaoPelicula daoPelicula;
	private static final int PRECIO_NORMAL = 5000;
	private static final int PRECIO_ESTRENO = 10000;

	public ServicioListarPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}

	public Collection<DtoPelicula> ejecutar() {
		List<DtoPelicula> res = this.daoPelicula.listar();
		asignarPrecio(res);
		return res;
	}

	public void asignarPrecio(List<DtoPelicula> lista) {
		DtoPelicula pelicula;
		for (int i = 0; i < lista.size(); i++) {
			pelicula = lista.get(i);
			int precio = calcularPrecio(pelicula.getFechaEstreno());
			pelicula.setPrecio(precio);
		}
	}

	public int calcularPrecio(LocalDate fecha) {
		LocalDate fechaHoy = LocalDate.now();
		if (fecha.isAfter(fechaHoy)) {
			return PRECIO_NORMAL;
		} else {
			return PRECIO_ESTRENO;

		}
	}

}
