package com.cesar20991.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.cesar20991.dao.UbigeoDAO;
import com.cesar20991.dao.UbigeoDAOImpl;
import com.cesar20991.model.Ubigeo;

@ManagedBean
@ViewScoped //Importante sino no funciona la segunda peticion del provincias
public class InicioBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int codigoPais;
	private int codigoRegion;
	private int codigoProvincia;
	private List<Ubigeo> lstPaises;
	private List<Ubigeo> lstRegiones;
	private List<Ubigeo> lstProvincias;
	private UbigeoDAO ubigeoDAO;
	
	public InicioBean() throws Exception{
		lstPaises = new ArrayList<>();
		lstRegiones = (new ArrayList<>());
		lstProvincias = new ArrayList<>(); // Set TreeSet
		ubigeoDAO = new UbigeoDAOImpl();
		this.listarPaises();
	}
	
	public void listarPaises() throws Exception {
		lstPaises = ubigeoDAO.listarPaises();
	}

	public void listarRegiones() throws Exception {
		lstRegiones = ubigeoDAO.listarRegiones(this.codigoPais);
	}

	public void listarProvincias() throws Exception {
		lstProvincias = ubigeoDAO.listarProvincias(this.codigoPais, this.codigoRegion);
	}
	
	/**
	 * Getters & Setters
	 **/
	
	public int getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(int codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public int getCodigoRegion() {
		return codigoRegion;
	}

	public void setCodigoRegion(int codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

	public List<Ubigeo> getLstPaises() {
		return lstPaises;
	}

	public void setLstPaises(List<Ubigeo> lstPaises) {
		this.lstPaises = lstPaises;
	}

	public List<Ubigeo> getLstRegiones() {
		return lstRegiones;
	}

	public void setLstRegiones(List<Ubigeo> lstRegiones) {
		this.lstRegiones = lstRegiones;
	}

	public List<Ubigeo> getLstProvincias() {
		return lstProvincias;
	}

	public void setLstProvincias(List<Ubigeo> lstProvincias) {
		this.lstProvincias = lstProvincias;
	}
	

}
