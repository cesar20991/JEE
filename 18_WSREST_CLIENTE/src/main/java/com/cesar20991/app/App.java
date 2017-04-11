package com.cesar20991.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.cesar20991.model.Persona;
import com.google.gson.Gson;

public class App {

	public static void main(String[] args) throws Exception {
		
		// PROBANDO CON EL 16_WSREST-JERSEY
		// Para acceder a una url propia en java
		URL url = new URL("http://localhost:8080/16_WSREST-JERSEY/rest/demo/cesar");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod("GET");
		
		if(conn.getResponseCode() != 200){
			throw new RuntimeException("Error HTTP: " + conn.getResponseCode());
		}
		
		// maquina automatizadora de lectura
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String salida;
		StringBuilder sb = new StringBuilder();
		while((salida = br.readLine()) != null){
			sb.append(salida);
		}
		
		System.out.println("RESULTADO DEL WS REST: " + sb.toString());
		
		Gson gson = new Gson();
		Persona per = gson.fromJson(sb.toString(), Persona.class);
		
		System.out.println("id: " + per.getIdPersona());
		System.out.println("Nombre: " + per.getNombres());
		
		conn.disconnect();
	}

}
