package com.cesar20991.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.cesar20991.model.Persona;
import com.cesar20991.service.IPersonaService;

@Named
@ViewScoped
public class PersonaBean implements Serializable {

	@Inject
	private IPersonaService service;
	private List<Persona> lstPersonas;
	@Inject
	private Persona persona;

	@PostConstruct
	public void init() {
		this.listar();
	}

	public void pruebaCDI() throws Exception {
		//Persona per = new Persona();
		// per.setIdPersona(5);
		//per.setNombres("Nicolas");
		//per.setApellidos("Zunini");
		service.registrar(persona);
	}
	
	public void registrarMySQL() throws Exception{
		service.registrarMySQL(persona);
	}

	public void listar() {
		try {
			lstPersonas = service.listar();
		} catch (Exception e) {

		}

	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
