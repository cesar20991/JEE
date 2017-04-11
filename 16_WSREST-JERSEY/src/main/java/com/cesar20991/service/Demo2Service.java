package com.cesar20991.service;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import com.cesar20991.entidad.Persona;
import com.google.gson.Gson;

@Path("demo2")
public class Demo2Service {
	
	/*
	 * TEST
	 * http://localhost:8080/16_WSREST-JERSEY/rest/demo2/cesar
	 * http://localhost:8080/16_WSREST-JERSEY/rest/demo2/xml/Capital%20Punishment
	 * http://localhost:8080/16_WSREST-JERSEY/rest/demo2/persona/1     -> Me devuelve así -> {"parametro1":"com.cesar20991.entidad.Persona@7397facc"}
	 * 
	 * */

	@GET
	@Produces("application/json")
	@Path("{param}")
	// metodo llamado por default
	public Response mostrar(@PathParam("param") String parametro) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("parametro1", parametro);
		jsonObject.put("parametro2", parametro);
		String salida = "" + jsonObject;
		return Response.status(200).entity(salida).build();
	}

	@GET
	@Path("/xml/{param}")
	@Produces("application/xml")
	public String mostrarXML(@PathParam("param") String parametro)  {		
		return "<curso><tema>" + parametro.toString() + "</tema></curso>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/persona/{param}") 
	public Response mostrarPersona(@PathParam("param") Integer id) throws JsonGenerationException, JsonMappingException, IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("parametro1", new Persona(id, "Cesar").toString());		
		String salida = "" + jsonObject;
		return Response.status(200).entity(salida).build();
		
//		ObjectMapper mapper = new ObjectMapper();
//		
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("parametro1", mapper.writeValueAsString(new Persona(id, "Cesar")) );		
//		
//		return Response.status(200).entity(jsonObject.toString()).build();
		// este ejemplo comentado me devuelve mal el json porque le agrega /" y es como si fuera un solo valor
	}
	
	
//	 {
//	     "firstName": "John", "lastName": "Smith", "age": 25,
//	     "address" : {
//	         "streetAddress": "21 2nd Street",
//	         "city": "New York",
//	         "state": "NY",
//	         "postalCode": "10021"
//	     },
//	     "phoneNumber": [
//	         { "type": "home", "number": "212 555-1234" },
//	         { "type": "fax", "number": "646 555-4567" }
//	     ]
//	 }
	
	

}
