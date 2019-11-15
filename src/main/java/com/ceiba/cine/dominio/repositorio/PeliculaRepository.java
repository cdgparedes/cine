package com.ceiba.cine.dominio.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;


public interface PeliculaRepository extends CrudRepository<PeliculaEntity,Long>{
	PeliculaEntity findBynombre(String nombre);
}
