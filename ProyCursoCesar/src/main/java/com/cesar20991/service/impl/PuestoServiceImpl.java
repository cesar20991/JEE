package com.cesar20991.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Named;

import com.cesar20991.dao.IPuestoDAO;
import com.cesar20991.model.Puesto;
import com.cesar20991.service.IPuestoService;

@Named
public class PuestoServiceImpl implements IPuestoService, Serializable{

	@EJB
	private IPuestoDAO dao;

	@Override
	public void registrar(Puesto t) throws Exception {
		dao.registrar(t);		
	}

	@Override
	public void modificar(Puesto t) throws Exception {
		dao.modificar(t);		
	}

	@Override
	public List<Puesto> listar() throws Exception {
		return dao.listar();
	}

	@Override
	public Puesto listarPorId(Puesto t) throws Exception {		
		return dao.listarPorId(t);
	}	
}
