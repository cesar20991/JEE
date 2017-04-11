package com.cesar20991.service;

import com.cesar20991.model.Contrato;
import com.cesar20991.model.Persona;

public interface IContratoService extends IService<Contrato>{

	int getSiguientePK(Persona persona);
}
