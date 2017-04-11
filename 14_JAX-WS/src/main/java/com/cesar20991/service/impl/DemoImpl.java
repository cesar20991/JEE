package com.cesar20991.service.impl;

import javax.jws.WebService;

import com.cesar20991.service.Demo;

@WebService(endpointInterface = "com.cesar20991.service.Demo")
public class DemoImpl implements Demo{

	@Override
	public String mostrar() {
		return "Ejemplos de JEE 7";
	}

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
