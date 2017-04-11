package com.cesar20991.dao;

import java.util.List;

import com.cesar20991.model.Ubigeo;

public interface UbigeoDAO {
	
	List<Ubigeo> listarPaises() throws Exception;
	List<Ubigeo> listarRegiones(int codPais) throws Exception;
	List<Ubigeo> listarProvincias(int codPais, int codRegion) throws Exception;
}
