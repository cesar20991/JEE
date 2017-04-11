package com.cesar20991.dao;

import java.util.List;

import com.cesar20991.model.Persona;

public interface PersonaDAO {

	void agregar(Persona persona);

	void eliminar(int personaId);

	void actualizar(Persona persona);

	List<Persona> listarTodos();

	Persona listarPorId(int id);

}
