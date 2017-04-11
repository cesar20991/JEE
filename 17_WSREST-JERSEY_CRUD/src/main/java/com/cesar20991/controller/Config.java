package com.cesar20991.controller;

import org.glassfish.jersey.server.ResourceConfig;

public class Config extends ResourceConfig {

	public Config() {
		// Se indican el paquete a escanear
		packages("com.mitocode");
	}
}
