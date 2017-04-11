package com.cesar20991.service;

import com.cesar20991.model.Persona;

public interface IPersonaService {//extends IService<Persona>{
	//si generas con el generico sale conflicto de namespace
	void registrar(Persona t) throws Exception;	
	void modificar(Persona t) throws Exception;
	//List<Persona> listar() throws Exception;
	Persona listarPorId(Persona t) throws Exception;
}
