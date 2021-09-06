package com.equifax.prueba.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equifax.prueba.dto.CoordenadaDTO;
import com.equifax.prueba.dto.CoordenadaRsDTO;
import com.equifax.prueba.entity.Coordenada;
import com.equifax.prueba.repository.CoordenadaRepository;

@Service
public class CoordenadaService {
	/** The repository. */
	@Autowired
	private CoordenadaRepository coordenadaRepository;

	/**
	 * Constructor UserRepository
	 * 
	 * @param AccessRepository
	 */
	public CoordenadaService(CoordenadaRepository coordenadaRepository) {
		this.coordenadaRepository = coordenadaRepository;
	}

	/**
	 * Método findAll
	 * 
	 * @param s/p
	 * @return lista de Access
	 */
	public CoordenadaRsDTO get(String lat, String lng) {
		Optional<Coordenada> coordenada = coordenadaRepository.findByLatAndLng(lat, lng);
		CoordenadaRsDTO coordenadaRsDTO = new CoordenadaRsDTO();
		coordenadaRsDTO.setLanInput(lat);
		coordenadaRsDTO.setLngInput(lng);
		if (coordenada.isPresent()) {
			CoordenadaDTO datos = new CoordenadaDTO();
			datos.setId(coordenada.get().getId());
			datos.setLat(coordenada.get().getLat());
			datos.setLng(coordenada.get().getLng());
			datos.setDescripcion(coordenada.get().getDescripcion());
			coordenadaRsDTO.setDatos(datos);
		}

		return coordenadaRsDTO;
	}
}
