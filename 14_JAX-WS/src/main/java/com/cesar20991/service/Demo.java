package com.cesar20991.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//JAX-WS
@WebService
//@SOAPBinding(style = Style.RPC)
public interface Demo {

	@WebMethod
	String mostrar();
	@WebMethod
	String saludar(String nombre);
}
