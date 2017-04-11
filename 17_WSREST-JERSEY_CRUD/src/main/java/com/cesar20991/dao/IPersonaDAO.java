package com.cesar20991.dao;

import java.util.List;

import javax.ejb.Local;

import com.cesar20991.model.Persona;
import com.cesar20991.model.PersonaForm;

@Local
public interface IPersonaDAO extends IDAO<Persona>{
	
	List<PersonaForm> listarForRest() throws Exception;

}

