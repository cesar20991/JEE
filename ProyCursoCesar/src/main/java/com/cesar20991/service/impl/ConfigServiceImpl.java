package com.cesar20991.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Named;

import com.cesar20991.dao.IConfigDAO;
import com.cesar20991.model.Config;
import com.cesar20991.service.IConfigService;

@Named
public class ConfigServiceImpl implements IConfigService, Serializable{

	@EJB
	private IConfigDAO dao;
	
	@Override
	public void registrar(Config t) throws Exception {
		dao.registrar(t);		
	}

	@Override
	public void modificar(Config t) throws Exception {
		dao.modificar(t);		
	}

	@Override
	public List<Config> listar() throws Exception {
		return dao.listar();
	}

	@Override
	public Config listarPorId(Config t) throws Exception { 
		return dao.listarPorId(t);
	}
	
	@Override
	public Config leerParametro(String parametro) throws Exception {
		return dao.leerParametro(parametro);		
	}

}
