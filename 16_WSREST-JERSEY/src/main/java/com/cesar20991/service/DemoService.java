package com.cesar20991.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.cesar20991.entidad.Persona;

@Path("/demo")
public class DemoService {

	/* TEST:
	 * http://localhost:8080/16_WSREST-JERSEY/rest/demo/cesar
	 * http://localhost:8080/16_WSREST-JERSEY/rest/demo/gson/cesar
	 * http://localhost:8080/16_WSREST-JERSEY/rest/demo/persona/1
	 * http://localhost:8080/16_WSREST-JERSEY/rest/demo/personas
	 * 
	 */

	@GET
	@Path("{param}")
	public Response mostrar(@PathParam("param") String parametro) {
		return Response.status(200).entity(parametro).build();
	}

	@GET
	@Path("/gson/{param}")
	public Response mostrarJSON(@PathParam("param") String parametro) {
		Gson gson = new Gson();
		String salida = gson.toJson(parametro);
		return Response.status(200).entity(salida).build();
	}

	@GET
	@Path("/persona/{parametro}")
	public Response mostrarPersona(@PathParam("parametro") Integer id) {
		Gson gson = new Gson();
		String salida = gson.toJson(new Persona(id, "Cesar"));
		return Response.status(200).entity(salida).build();
	}

	@GET
	@Path("/personas/")
	public Response mostrarPersonas() {
		Gson gson = new Gson();
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Cesar"));
		lista.add(new Persona(2, "Carlos"));
		lista.add(new Persona(3, "karla"));
		lista.add(new Persona(4, "Jimena"));
		String salida = gson.toJson(lista);
		return Response.status(200).entity(salida).build();
	}

}
