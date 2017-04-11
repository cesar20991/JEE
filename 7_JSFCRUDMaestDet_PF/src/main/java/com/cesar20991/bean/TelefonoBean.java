package com.cesar20991.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.cesar20991.dao.TelefonoDAO;
import com.cesar20991.dao.TelefonoDAOImpl;
import com.cesar20991.model.Persona;
import com.cesar20991.model.Telefono;

@ManagedBean
@ViewScoped // si se trabaja con mucho ajax usar viewScoped
public class TelefonoBean implements Serializable {

	private int idPersona;
	private Telefono telefono;
	private List<Telefono> lstTelefono;
	private List<Telefono> lstTemporal;
	private TelefonoDAO dao;
	//@ManagedProperty(value = "#{personaBean}") // esto es un inyección simple
	//private PersonaBean personaBean; En caso quiera usar metodos de otro bean, elotro managedBean debe tener un name = ""

	public TelefonoBean() {
		telefono = new Telefono();
		lstTelefono = new ArrayList<>();
		lstTemporal = new ArrayList<>();
		dao = new TelefonoDAOImpl();
		//personaBean.listar();
		this.listar();
	}

	public void listar() {
		try {
			lstTelefono = dao.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregar() {
		// Agregar este bloque para no tener problemas con valores de referencia.
		Telefono tel = new Telefono();
		Persona per = new Persona();		
		tel.setNumero(telefono.getNumero());
		per.setId(this.idPersona);
		tel.setPersona(per);
		lstTemporal.add(tel);
	}

	public void registrar() {
		try {
			dao.registrar(lstTemporal);
			this.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * getters & setters
	 */

	public List<Telefono> getLstTelefono() {
		return lstTelefono;
	}

	public void setLstTelefono(List<Telefono> lstTelefono) {
		this.lstTelefono = lstTelefono;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public List<Telefono> getLstTemporal() {
		return lstTemporal;
	}

	public void setLstTemporal(List<Telefono> lstTemporal) {
		this.lstTemporal = lstTemporal;
	}

}
