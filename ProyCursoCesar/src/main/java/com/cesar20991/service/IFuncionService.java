package com.cesar20991.service;

import java.util.List;

import com.cesar20991.model.Funcion;
import com.cesar20991.model.Puesto;

public interface IFuncionService  {

	public List<Funcion> listar(Puesto p) throws Exception;
}
