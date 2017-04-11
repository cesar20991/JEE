package com.cesar20991.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cesar20991.dao.TablaDAO;
import com.cesar20991.dao.impl.TablaDAOImpl;
import com.cesar20991.model.Celda;
import com.cesar20991.model.Columna;
import com.cesar20991.model.Fila;
import com.cesar20991.service.ITablaService;

public class TablaServiceImpl implements ITablaService {

	private TablaDAO dao;

	public TablaServiceImpl() {
		dao = new TablaDAOImpl();
	}

	@Override
	public List<Fila> getFilas() throws Exception {
		List<Fila> filas = new ArrayList<>();
		try {
			filas = dao.getFilas();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public List<Columna> getColumnas() throws Exception {
		List<Columna> columnas = new ArrayList<>();
		try {
			columnas = dao.getColumnas();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return columnas;
	}

	@Override
	public List<Celda> getCeldas() throws Exception {
		List<Celda> celdas = new ArrayList<>();
		try {
			celdas = dao.getCeldas();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return celdas;
	}

	@Override
	public void actualizarFila(Fila fila) throws Exception {
		try {
			dao.actualizarFila(fila);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
