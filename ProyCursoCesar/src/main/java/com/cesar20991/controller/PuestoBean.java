package com.cesar20991.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Faces;

import com.cesar20991.model.Funcion;
import com.cesar20991.model.Persona;
import com.cesar20991.model.Puesto;
import com.cesar20991.model.Telefono;
import com.cesar20991.service.IFuncionService;
import com.cesar20991.service.IPuestoService;
import com.cesar20991.util.MensajeManager;

@Named
@ViewScoped
public class PuestoBean implements Serializable {

	@Inject
	private IFuncionService funcionService;
	@Inject
	private IPuestoService service;
	private List<Puesto> lstPuestos;
	private List<Funcion> lstFuncionSel; // select de datatable
	@Inject
	private Puesto puestoSel; // select de datatable
	
	@PostConstruct
	public void init() {
		lstPuestos = new ArrayList<>();
		this.listar();
	}

	public void listar() {
		try {
			lstPuestos = service.listar();
		} catch (Exception e) {

		}

	}

	public void seleccionar(Puesto pue) throws Exception {
		// Enviar por omnifaces
		Faces.setFlashAttribute("idPuesto", pue.getIdPuesto());
	}
	
	public void buscarFunciones(){
		try {
			lstFuncionSel = funcionService.listar(puestoSel);
		} catch (Exception e) {
			MensajeManager.mostrarMensaje("Error", e.getMessage(), "ERROR");
		}
	}
	
	/**
	 * getters & setters
	 * 
	 * @return
	 */

	public List<Puesto> getLstPuestos() {
		return lstPuestos;
	}

	public void setLstPuestos(List<Puesto> lstPuestos) {
		this.lstPuestos = lstPuestos;
	}

	public List<Funcion> getLstFuncionSel() {
		return lstFuncionSel;
	}

	public void setLstFuncionSel(List<Funcion> lstFuncionSel) {
		this.lstFuncionSel = lstFuncionSel;
	}

	public Puesto getPuestoSel() {
		return puestoSel;
	}

	public void setPuestoSel(Puesto puestoSel) {
		this.puestoSel = puestoSel;
	}

}
