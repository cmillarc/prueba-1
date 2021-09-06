package com.equifax.prueba;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.equifax.prueba.controller.Pruebacontroller;
import com.equifax.prueba.dto.CoordenadaRsDTO;
import com.equifax.prueba.service.LoginService;

public class PruebaLoginTest {

	@InjectMocks
	private Pruebacontroller pruebacontroller = new Pruebacontroller();

	@Mock
	private LoginService loginService;

	CoordenadaRsDTO coordenadaRsDTO;
/*
	@Test
	public void testFindAllAccess() {
		Mockito.when(loginService.get(Mockito.anyString(), Mockito.anyString())).thenReturn(Boolean.TRUE);
		Assert.assertEquals(Boolean.TRUE, pruebacontroller.usuario(Mockito.anyString(), Mockito.anyString()));
	}*/

}
