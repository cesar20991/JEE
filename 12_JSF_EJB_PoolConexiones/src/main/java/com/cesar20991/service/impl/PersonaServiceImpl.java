package com.cesar20991.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.cesar20991.dao.IPersonaDAO;
import com.cesar20991.model.Persona;
import com.cesar20991.service.IPersonaService;

@Named
@RequestScoped
public class PersonaServiceImpl implements IPersonaService, Serializable{

	//@Inject
	@EJB
	private IPersonaDAO dao;
	
	@Override
	public void registrar(Persona per) throws Exception {
		dao.registrar(per);
	}
	
	@Override
	public void registrarMySQL(Persona per) throws Exception {
		dao.registrarMySQL(per);
	}

	@Override
	public void modificar(Persona per) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> listar() throws Exception {
		return dao.listar();
	}

}
