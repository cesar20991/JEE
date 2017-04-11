package com.cesar20991.dao;

import java.util.List;

import javax.ejb.Local;

import com.cesar20991.model.Funcion;
import com.cesar20991.model.Puesto;

@Local
public interface IFuncionDAO {//extends IDAO<Funcion>{
	
	public List<Funcion> listar(Puesto p) throws Exception;
}
