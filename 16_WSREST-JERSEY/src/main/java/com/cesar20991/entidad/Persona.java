package com.cesar20991.entidad;

public class Persona {

	private Integer id;
	private String nombre;
	
	public Persona(){
		
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

	public Persona(Integer id, String nombre) {		
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
