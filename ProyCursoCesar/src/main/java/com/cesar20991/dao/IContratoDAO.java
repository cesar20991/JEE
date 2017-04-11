package com.cesar20991.dao;

import javax.ejb.Local;

import com.cesar20991.model.Contrato;
import com.cesar20991.model.Persona;

@Local
public interface IContratoDAO extends IDAO<Contrato>{

	int getSiguientePK(Persona persona);
}
