package com.cesar20991.service.impl;

import com.cesar20991.dao.IPersonaDAO;
import com.cesar20991.dao.impl.PersonaDAOImpl;
import com.cesar20991.model.Persona;
import com.cesar20991.service.IPersonaService;

public class PersonaServiceImpl implements IPersonaService{

	private IPersonaDAO dao;
	
	public PersonaServiceImpl(){
		dao = new PersonaDAOImpl();
	}
	
	@Override
	public void registrar(Persona per) throws Exception {
		dao.registrar(per);
		//  http://localhost:8080/15_1_WSSOAP_CRUD/services/PersonaServiceImpl?WSDL		
	}
		
	@Override
	public void modificar(Persona per) throws Exception {
		dao.modificar(per);		
	}

	/*@Override
	public List<Persona> listar() throws Exception {
		return dao.listar();
	}*/
	
	@Override
	public Persona listarPorId(Persona per) throws Exception {
		return dao.listarPorId(per);
	}
	
	
	// AL PROBAR EN SOAP UI
//	<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:impl="http://impl.service.cesar20991.com" xmlns:mod="http://model.cesar20991.com">
//	   <soapenv:Header/>
//	   <soapenv:Body>
//	      <impl:registrar>
//	         <impl:per>
//	            <mod:apellidos>Perez</mod:apellidos>
//	            <mod:direccion>XYZ</mod:direccion>
//	            <mod:fechaNac>2013-02-01T23:00:00</mod:fechaNac>
//	            <mod:nombres>Lorena</mod:nombres>
//	            <mod:sexo>F</mod:sexo>
//	         </impl:per>
//	      </impl:registrar>
//	   </soapenv:Body>
//	</soapenv:Envelope>
	

}
