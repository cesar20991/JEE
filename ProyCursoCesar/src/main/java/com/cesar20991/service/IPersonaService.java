package com.cesar20991.service;

import java.util.List;

import com.cesar20991.model.Persona;
import com.cesar20991.model.Telefono;

public interface IPersonaService extends IService<Persona>{
	
	List<Telefono> getTelefonosXPersona(Persona per);
	
}
