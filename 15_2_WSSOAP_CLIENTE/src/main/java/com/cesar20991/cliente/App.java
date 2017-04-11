package com.cesar20991.cliente;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import com.cesar20991.model.Persona;
import com.cesar20991.service.impl.PersonaServiceImpl;
import com.cesar20991.service.impl.PersonaServiceImplService;
import com.cesar20991.service.impl.PersonaServiceImplServiceLocator;
import com.cesar20991.service.impl.PersonaServiceImplSoapBindingStub;

public class App {
	
	// El consumo del servicio web SOAP se hizo mediante apache axis. -> clic derecho en src/main/java y web service client
	
	public static void main(String[] args) throws RemoteException, ServiceException {
		PersonaServiceImplService serviceLocator = new PersonaServiceImplServiceLocator();
		PersonaServiceImpl personaWS = (PersonaServiceImpl)serviceLocator.getPort(PersonaServiceImplSoapBindingStub.class);
		
		Persona per = new Persona();
		per.setApellidos("Oropeza");
		per.setDireccion("xyz");
		per.setFechaNac(Calendar.getInstance());
		per.setFoto(null);
		per.setNombres("Cesar");
		per.setSexo("M");
		
		personaWS.registrar(per);
	}

}
