package com.cesar20991.dao;

import java.util.List;

public interface IDAO<T> {

	void registrar(T t) throws Exception;	
	void modificar(T t) throws Exception;
	void eliminar(T t) throws Exception;
	List<T> listar() throws Exception;
	T listarPorId(T t) throws Exception;	
}
