package com.cesar20991.cliente;

import com.cesar20991.service.Demo;
import com.cesar20991.service.IPersonaService;
import com.cesar20991.service.Persona;
import com.cesar20991.service.impl.DemoImplService;
import com.cesar20991.service.impl.DemoImplServiceLocator;
import com.cesar20991.service.impl.PersonaServiceImplService;
import com.cesar20991.service.impl.PersonaServiceImplServiceLocator;

public class App {

	public static void main(String[] args) throws Exception{
		DemoImplService serviceDemoPort = new DemoImplServiceLocator();
		Demo demoService = serviceDemoPort.getDemoImplPort();
		
		System.out.println(demoService.mostrar());
		System.out.println(demoService.saludar("Cesar"));
		
		
		PersonaServiceImplService servicePersonaPort = new PersonaServiceImplServiceLocator();
		IPersonaService personaService = servicePersonaPort.getPersonaServiceImplPort();
		
		Persona[] arreglo = personaService.listar();
		for(Persona per : arreglo){
			System.out.println(per.getIdPersona());
			System.out.println(per.getNombres());
			System.out.println(per.getApellidos());
			System.out.println();
		}
	}

}
