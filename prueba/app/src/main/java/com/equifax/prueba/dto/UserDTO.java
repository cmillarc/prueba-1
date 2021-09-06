package com.equifax.prueba.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class UserDTO.
 *
 * @author cmillar
 */
@Data
@NoArgsConstructor
public class UserDTO {

	/** id **/
	private Integer id;

	/** usuario **/
	private String usuario;

	/** password **/
	private String password;

}
