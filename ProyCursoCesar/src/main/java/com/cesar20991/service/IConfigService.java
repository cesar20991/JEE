package com.cesar20991.service;

import com.cesar20991.model.Config;

public interface IConfigService extends IService<Config>{
	
	Config leerParametro(String parametro) throws Exception;

}
