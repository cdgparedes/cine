package com.ceiba.cine.dominio.servicio;

import java.util.List;

import com.ceiba.cine.dominio.modelo.entidad.Pelicula;
import com.ceiba.cine.dominio.puerto.dao.DaoPelicula;
import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

public class ServicioActualizarPelicula {
	
	private DaoPelicula daoPelicula;
	
	public ServicioActualizarPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
		
	}
	
	/*public void ejecutar(Pelicula pelicula) {
		System.out.println("hola" + pelicula);
		this.daoPelicula.actualizar(pelicula);
		
	}*/
	public void ejecutar(Pelicula pelicula) {
		//existe(pelicula);
		//System.out.println("Existe pelicula" + pelicula.getId());
		List<PeliculaEntity> existepelicula = this.daoPelicula.obtenerXnombre(pelicula.getNombre());
		 if(existepelicula.size()==0) {
			throw new RuntimeException("no existe");
			
		 }
		 System.out.println("Existe id en BD" + existepelicula.get(0).getId());
		 pelicula.setId(existepelicula.get(0).getId());
		 System.out.println("Esto es lo que hay en pelicula " + existepelicula.get(0));
		 //pelicula.setDetalle(existepelicula.get(0).getDetalle());
		this.daoPelicula.actualizar(pelicula);
		
	}
	/*public void existe(Pelicula pelicula) {
	 //System.out.println("ESTO ES NOM" + pelicula.getNombre());	
	 List<PeliculaEntity> existepelicula = this.daoPelicula.obtenerXnombre(pelicula.getNombre());
	 if(existepelicula.isEmpty()) {
		throw new RuntimeException("no existe");
		
	 }
	 System.out.println("Existe id en BD" + existepelicula.get(0).getId());
	 pelicula.setId(existepelicula.get(0).getId());
	 
		
	}*/
	


}
