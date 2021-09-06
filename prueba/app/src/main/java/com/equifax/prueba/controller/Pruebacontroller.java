package com.equifax.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.equifax.prueba.dto.CoordenadaRsDTO;
import com.equifax.prueba.service.CoordenadaService;
import com.equifax.prueba.service.LoginService;

@CrossOrigin(origins = "*")
@RestController
public class Pruebacontroller {

	@Autowired
	private LoginService loginService;

	@Autowired
	private CoordenadaService coordenadaService;

	@GetMapping(value = "/login/{usuario}/{password}")
	public boolean usuario(@PathVariable String usuario, @PathVariable String password) {
		return loginService.get(usuario, password);
	}

	@GetMapping(value = "/home/{lat}/{lng}")
	public CoordenadaRsDTO coordenada(@PathVariable String lat, @PathVariable String lng) {
		return coordenadaService.get(lat, lng);
	}
	
	@GetMapping(value = "/")
	public String get() {
		return "hola";
	}

}
