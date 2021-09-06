package com.equifax.prueba.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equifax.prueba.entity.Coordenada;

public interface CoordenadaRepository extends JpaRepository<Coordenada, Integer> {

	Optional<Coordenada> findByLatAndLng(String lat, String lng);

}
