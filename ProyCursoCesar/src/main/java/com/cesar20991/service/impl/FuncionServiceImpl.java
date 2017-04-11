package com.cesar20991.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Named;

import com.cesar20991.dao.IFuncionDAO;
import com.cesar20991.model.Funcion;
import com.cesar20991.model.Puesto;
import com.cesar20991.service.IFuncionService;

@Named
public class FuncionServiceImpl implements IFuncionService, Serializable {

	@EJB
	private IFuncionDAO dao;

	@Override
	public List<Funcion> listar(Puesto p) throws Exception {
		return dao.listar(p);
	}
}
