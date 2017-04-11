package com.cesar20991.app;

import java.util.logging.Logger;

public class Documento {
	
	private final static Logger LOGGER = Logger.getLogger(Documento.class.getName());

	public static String buscarPersona(String tipo, String valor) {
		String mensaje = "";
		int contador = 0;
		
		try {
			if (tipo.equalsIgnoreCase("DNI") || tipo.equalsIgnoreCase("RUC")) {
				LOGGER.info("Tipo Documento OK");
			} else {
				contador++;
			}

			int numero = Integer.parseInt(valor);
			if (numero >= 00000001 && numero <= 99999999) {
				LOGGER.info("Tipo Documento OK");
			}else{
				contador++;
			}			
		} catch (Exception e) {
			contador++;
			LOGGER.severe("Error " + e.getMessage());
		}finally{
			if(contador > 0){
				mensaje = "ERROR";
			}else{
				mensaje = "OK";
			}
		}		
		return mensaje;
	}
}
