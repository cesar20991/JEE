package com.cesar20991.dao;

import java.util.List;

import javax.ejb.Local;

import com.cesar20991.model.Persona;

@Local
public interface IPersonaDAO {

	void registrar(Persona per) throws Exception;
	void registrarMySQL(Persona per) throws Exception;
	void modificar(Persona per) throws Exception;
	List<Persona> listar() throws Exception;
}

