package com.cesar20991.service;

import org.glassfish.jersey.server.ResourceConfig;

public class Config extends ResourceConfig {

	public Config() {
		// Se indican el paquete a escanear
		packages("com.cesar20991");
	}
}
