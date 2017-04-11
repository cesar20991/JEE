package com.cesar20991.service;

import java.util.List;

import com.cesar20991.model.Persona;

public interface IPersonaService {

	void registrar(Persona per) throws Exception;
	void registrarMySQL(Persona per) throws Exception;
	void modificar(Persona per) throws Exception;
	List<Persona> listar() throws Exception;
}
