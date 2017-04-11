package com.cesar20991.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cesar20991.dao.PersonaDAO;
import com.cesar20991.dao.PersonaDAOImpl;
import com.cesar20991.model.Persona;

@ManagedBean
@SessionScoped // COmo estaba en un viewScoped va a volver a crear el constructor. Pasamos a un scope mayor (sessionScoped)
public class PersonaBean implements Serializable {
	private List<Persona> lista;
	private PersonaDAO dao;
	private Persona persona;

	public PersonaBean() {
		dao = new PersonaDAOImpl();
		persona = new Persona();
		this.listar();
	}

	public void registrar() {
		try {
			if (persona.getId() > 0) {
				dao.actualizar(persona);
			} else {
				dao.agregar(persona);
			}
			this.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void eliminar(Persona per) {
		try {
			dao.eliminar(per.getId());
			this.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void listar() {
		try {
			lista = dao.listarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void listarPorId(Persona per) {
		try {
			persona = dao.listarPorId(per.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void limpiarControles(){
		this.persona = new Persona();
	}

	/**
	 * getters & setters
	 */

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}
