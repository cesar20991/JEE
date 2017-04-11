package com.cesar20991.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.cesar20991.model.Persona;

@WebService
//@SOAPBinding(style = Style.RPC) document default
public interface IPersonaService {

	@WebMethod List<Persona> listar();
	
}
