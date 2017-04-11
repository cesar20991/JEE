package com.cesar20991.dao;

import java.util.List;

import com.cesar20991.model.Celda;
import com.cesar20991.model.Columna;
import com.cesar20991.model.Fila;

public interface TablaDAO {

	List<Fila> getFilas() throws Exception;

	List<Columna> getColumnas() throws Exception;

	List<Celda> getCeldas() throws Exception;
	
	void actualizarFila(Fila fila) throws Exception;
}
