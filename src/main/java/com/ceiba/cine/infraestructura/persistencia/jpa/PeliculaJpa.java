package com.ceiba.cine.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.cine.infraestructura.persistencia.entidad.PeliculaEntity;

public interface PeliculaJpa extends JpaRepository<PeliculaEntity, Long> {
}
