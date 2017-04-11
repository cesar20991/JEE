package com.cesar20991.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.cesar20991.dao.PersonaDAO;
import com.cesar20991.dao.PersonaDAOImpl;
import com.cesar20991.model.Persona;

@ManagedBean
@ViewScoped
public class PersonaListaBean {

	private List<Persona> lista;
	private PersonaDAO dao;

	public PersonaListaBean() {
		dao = new PersonaDAOImpl();
		this.listar();
	}

	public void listar() {
		try {
			lista = dao.listarTodos();
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

	/**
	 * getters & setters
	 */

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

}
