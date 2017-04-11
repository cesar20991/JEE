package com.cesar20991.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.cesar20991.model.Persona;
import com.cesar20991.service.IPersonaService;

@WebService(endpointInterface = "com.cesar20991.service.IPersonaService")
public class PersonaServiceImpl implements IPersonaService{

	@Override
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1,"Thaily","Perez"));
		lista.add(new Persona(2,"Karla","Mendoza"));
		return lista;
	}

}
