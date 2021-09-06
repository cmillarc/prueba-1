package com.equifax.prueba.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class CoordenadaRsDTO.
 *
 * @author cmillar
 */
@Data
@NoArgsConstructor
public class CoordenadaRsDTO {

	/** lanInput **/
	private String lanInput;

	/** lngInput **/
	private String lngInput;

	/** datos **/
	private CoordenadaDTO datos;

}
