package com.cesar20991.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.cesar20991.dao.PersonaDAO;
import com.cesar20991.dao.PersonaDAOImpl;
import com.cesar20991.model.Persona;

@ManagedBean
@ViewScoped
public class PersonaFormBean {

	private Persona persona;
	private PersonaDAO dao;

	public PersonaFormBean() {
		dao = new PersonaDAOImpl();
		persona = new Persona();
	}

	public void registrar() {
		try {
			if (persona.getId() > 0) {
				dao.actualizar(persona);
			} else {
				dao.agregar(persona);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * getters & setters
	 */

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
