package com.cesar20991.service;

import java.util.List;

import com.cesar20991.model.Celda;
import com.cesar20991.model.Columna;
import com.cesar20991.model.Fila;

//ManagedBean ---> Service -> DAO Oracle
//ManagedBean ---> Service -> DAO Mysql
//ManagedBean ---> Service -> WS

public interface ITablaService {

	List<Fila> getFilas() throws Exception;

	List<Columna> getColumnas() throws Exception;

	List<Celda> getCeldas() throws Exception;
		
	void actualizarFila(Fila fila) throws Exception;
}
