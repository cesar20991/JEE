package com.cesar20991.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Faces;

import com.cesar20991.model.Contrato;
import com.cesar20991.service.IContratoService;

@Named
@ViewScoped
public class ContratoBean implements Serializable {

	@Inject
	private IContratoService contratoService;
	private List<Contrato> lstContratos;

	@PostConstruct
	public void init() {
		this.lstContratos = new ArrayList<>();
		this.listarContratos();
	}

	public void listarContratos() {
		try {
			this.lstContratos = contratoService.listar();
		} catch (Exception e) {

		}
	}

	public void seleccionar(Contrato cont) throws Exception {
		Faces.setFlashAttribute("contrato", cont);
	}

	public List<Contrato> getLstContratos() {
		return lstContratos;
	}

	public void setLstContratos(List<Contrato> lstContratos) {
		this.lstContratos = lstContratos;
	}

}
