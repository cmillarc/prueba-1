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
 * The Class Coordenada.
 *
 * @author cmillar
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "coordenada")
public class Coordenada {

	/** The id **/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The code **/
	@Column(name = "lat")
	private String lat;

	/** The description **/
	@Column(name = "lng")
	private String lng;	

	/** The descripcion **/
	@Column(name = "descripcion")
	private String descripcion;

}
