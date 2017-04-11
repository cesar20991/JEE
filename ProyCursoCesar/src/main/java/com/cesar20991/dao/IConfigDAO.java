package com.cesar20991.dao;

import com.cesar20991.model.Config;

public interface IConfigDAO extends IDAO<Config>{
	
	Config leerParametro(String parametro) throws Exception;

}
