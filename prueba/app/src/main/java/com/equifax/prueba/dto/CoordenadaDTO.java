package com.equifax.prueba.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class CoordenadaDTO.
 *
 * @author cmillar
 */
@Data
@NoArgsConstructor
public class CoordenadaDTO {

	/** The id **/
	private Integer id;

	/** The lat **/
	private String lat;

	/** The lng **/
	private String lng;
	
	/** The descripcion **/
	private String descripcion;
}
