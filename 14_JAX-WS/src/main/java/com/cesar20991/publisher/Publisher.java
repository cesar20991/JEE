package com.cesar20991.publisher;

import javax.xml.ws.Endpoint;

import com.cesar20991.service.impl.DemoImpl;
import com.cesar20991.service.impl.PersonaServiceImpl;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9098/ws/demo", new DemoImpl());
		Endpoint.publish("http://localhost:9098/ws/persona", new PersonaServiceImpl());
		
		//Al hacer -> test http://localhost:9098/ws/persona?WSDL
	}
}
