package com.equifax.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equifax.prueba.repository.UserRepository;

@Service
public class LoginService {
	/** The repository. */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Constructor UserRepository
	 * 
	 * @param AccessRepository
	 */
	public LoginService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/**
	 * Método findAll
	 * 
	 * @param s/p
	 * @return lista de Access
	 */
	public boolean get(String usuario, String password) {
		return userRepository.findByUsuarioAndPassword(usuario, password).isPresent();

	}
}
