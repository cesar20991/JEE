package com.cesar20991.dao;

import java.util.List;

import com.cesar20991.model.Persona;

public interface IPersonaDAO {

	void registrar(Persona per) throws Exception;
	void modificar(Persona per) throws Exception;
	List<Persona> listar() throws Exception;
}

