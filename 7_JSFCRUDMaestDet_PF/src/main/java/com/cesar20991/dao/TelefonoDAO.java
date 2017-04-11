package com.cesar20991.dao;

import java.util.List;

import com.cesar20991.model.Telefono;

public interface TelefonoDAO {

	void registrar(List<Telefono> lstTelefonos) throws Exception;
	List<Telefono> listar() throws Exception;
}
