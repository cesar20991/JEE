package com.cesar20991.dao;

import com.cesar20991.model.Persona;

public class Test {

	public static void main(String[] args) {
		PersonaDAO dao = new PersonaDAOImpl();
		Persona per = new Persona();
		per.setNombres("Cesar");
		per.setApellidos("Oropeza");		
		dao.agregar(per);
		
	}
}
