package com.equifax.prueba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class User.
 *
 * @author cmillar
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "usuario")
public class User {

	/** The id **/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The code **/
	@Column(name = "usuario")
	private String usuario;

	/** The description **/
	@Column(name = "password")
	private String password;

}
