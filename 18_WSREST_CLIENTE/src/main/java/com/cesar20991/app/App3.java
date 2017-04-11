package com.cesar20991.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class App3 {

	// ' \" ' caracteres de escape en JSON. OJO
	
	public static void main(String[] args) throws Exception {
		// PROBANDO CON EL 17_WSREST-JERSEY
		// Para acceder a una url propia en java
		// El metodo modificar solo afecta a nombres y apellidos
		URL url = new URL("http://localhost:8080/7_JSFCRUDMaestroDet_PF/rest/persona/modificar/9");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setDoOutput(true);
		conn.setRequestMethod("PUT");
		conn.setRequestProperty("Content-Type", "application/json");
		
		String entrada= "{\"nombres\":\"Lorena\",\"apellidos\":\"Perez Mercedes\",\"fechaNac\":\"1991-01-21\",\"sexo\":\"F\",\"direccion\":\"xyzs\"}";
		
		OutputStream os = conn.getOutputStream();
		os.write(entrada.getBytes());
		os.flush();

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

		conn.disconnect();
	}

}
