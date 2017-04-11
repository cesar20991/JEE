package com.cesar20991.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.cesar20991.model.Persona;
import com.cesar20991.service.IPersonaService;

@Named // reemplaza al managed bean 'javax.inject.Named;'
@ViewScoped // el @viewScoped es 'javax.faces.view.ViewScoped'
public class PersonaBean implements Serializable {

	@Inject
	private IPersonaService service;
	private List<Persona> lstPersonas;

	@PostConstruct
	public void init(){
		this.listar();
	}
	
	public void pruebaCDI() throws Exception {
		Persona per = new Persona();
		per.setIdPersona(2);
		per.setNombres("Cesar");
		per.setApellidos("Oropeza");
		service.registrar(per);
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

}
