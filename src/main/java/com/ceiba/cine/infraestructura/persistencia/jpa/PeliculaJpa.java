package com.ceiba.cine.infraestructura.persistencia.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

public interface PeliculaJpa extends JpaRepository<PeliculaEntity, Long> {

	List<PeliculaEntity> findByNombre(String nombre);
}
