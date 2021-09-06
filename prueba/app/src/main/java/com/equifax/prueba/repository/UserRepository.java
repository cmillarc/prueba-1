package com.equifax.prueba.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equifax.prueba.entity.User;

	public interface UserRepository extends JpaRepository<User, Integer>{

		Optional<User> findByUsuarioAndPassword(String usuario, String password);

}
