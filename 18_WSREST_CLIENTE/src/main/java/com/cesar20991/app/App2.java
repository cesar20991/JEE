package com.cesar20991.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.cesar20991.model.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class App2 {

	public static void main(String[] args) throws Exception {
		// PROBANDO CON EL 17_WSREST-JERSEY
		// Para acceder a una url propia en java
		URL url = new URL("http://localhost:8080/7_JSFCRUDMaestroDet_PF/rest/persona/listar");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("GET");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Error HTTP: " + conn.getResponseCode());
		}

		// maquina automatizadora de lectura
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		String salida;
		StringBuilder sb = new StringBuilder();
		while ((salida = br.readLine()) != null) {
			sb.append(salida);
		}

		System.out.println("RESULTADO DEL WS REST: " + sb.toString());

		Gson gson = new Gson();
		
		List<Persona> lista = gson.fromJson(sb.toString(), new TypeToken<List<Persona>>(){}.getType());
		lista.forEach(s -> System.out.println(s.getNombres() + "- " + s.getApellidos()));
		
		conn.disconnect();
	}

}
