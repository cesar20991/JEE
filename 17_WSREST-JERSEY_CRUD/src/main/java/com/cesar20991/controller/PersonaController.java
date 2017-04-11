package com.cesar20991.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.cesar20991.dao.IPersonaDAO;
import com.cesar20991.dao.impl.PersonaDAOImpl;
import com.cesar20991.model.Persona;
import com.cesar20991.model.PersonaForm;

@Path("persona")
public class PersonaController {

	private IPersonaDAO dao;

	public PersonaController() {
		dao = new PersonaDAOImpl();
	}

	@GET
	@Path("/listar")	
	public Response listar() {
		List<PersonaForm> lista = new ArrayList<>();
		Gson gson = new Gson();
		String salida;
		try {
			lista = dao.listarForRest();
			salida = gson.toJson(lista);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.status(Response.Status.OK).entity(salida).build();
	}
	
	@GET
	@Path("/leer/{id}")	
	public Response leer(@PathParam("id") Integer id) {		
		Gson gson = new Gson();
		String salida;
		try {
			Persona per = new Persona();
			per.setIdPersona(id);
			per = dao.listarPorId(per);
			if(per != null && per.getIdPersona() > 0){
				salida = gson.toJson(per);	
			}else{
				salida = gson.toJson("No existe persona con el id " + id);
			}
			
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.status(Response.Status.OK).entity(salida).build();
	}
		
	@POST
	@Path("/registrar")
	@Consumes("application/json") //se necesita dar salida json -> probar en postman parte body >raw (ahi poner el json). {"nombres":"Cesar Augusto", "apellidos":"Oropeza", "fechaNac":"1991-01-21","sexo":"M","direccion":"xyz"}
	@Produces("application/json") 
	public Response registrar(Persona persona){ //requiere jackson para usar Object
		String salida;
		try{
			dao.registrar(persona);
			Gson gson = new Gson(); //opcional
			salida = gson.toJson("Éxito al guardar");
		}catch(Exception e){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.status(Response.Status.OK).entity(salida).build();
	}
	
	@PUT
	@Path("/modificar/{id}")	
	@Consumes("application/json") //se necesita dar salida json -> probar en postman  parte body >raw (ahi poner el json). {"nombres":"Carlos", "apellidos":"Oropeza", "fechaNac":"1991-01-21","sexo":"M","direccion":"xyz"}
	@Produces("application/json")
	public Response modificar(@PathParam("id") Integer id, Persona persona) {		
		String salida;
		try{
			persona.setIdPersona(id);
			dao.modificar(persona);
			Gson gson = new Gson(); //opcional
			salida = gson.toJson("Éxito al modificar");			
		}catch(Exception e){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.status(Response.Status.OK).entity(salida).build();
	}
	
	@DELETE
	@Path("/eliminar/{id}")	
	public Response eliminar(@PathParam("id") Integer id) {		
		Gson gson = new Gson();
		String salida;
		try {
			Persona per = new Persona();
			per.setIdPersona(id);
			dao.eliminar(per);
			salida = gson.toJson("Éxito al eliminar");
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.status(Response.Status.OK).entity(salida).build();
	}
	
}
