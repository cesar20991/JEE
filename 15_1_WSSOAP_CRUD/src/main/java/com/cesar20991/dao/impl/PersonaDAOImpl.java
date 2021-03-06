package com.cesar20991.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cesar20991.dao.Conexion;
import com.cesar20991.dao.IPersonaDAO;
import com.cesar20991.model.Persona;

public class PersonaDAOImpl implements IPersonaDAO, Serializable {

	private Connection cx;

	public PersonaDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public void registrar(Persona persona) {
		try {
			String sql = "INSERT INTO PERSONA(apellidos, direccion, fechanac, foto, nombres, sexo) VALUES (?,?,?,?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, persona.getApellidos());
			preparedStatement.setString(2, persona.getDireccion());			
			preparedStatement.setDate(3, new java.sql.Date((persona.getFechaNac().getTime())));
			preparedStatement.setBytes(4, persona.getFoto());
			preparedStatement.setString(5, persona.getNombres());
			preparedStatement.setString(6, persona.getSexo());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void modificar(Persona persona) {
		//try {
			/*String sql = "UPDATE PERSONA SET NOMBRES = ?, APELLIDOS = ?, FOTO = ? WHERE ID = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, persona.getNombres());
			preparedStatement.setString(2, persona.getApellidos());
			preparedStatement.setBytes(3, persona.getFoto());
			preparedStatement.setInt(4, persona.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	@Override
	public List<Persona> listar() {
		/*List<Persona> personas = new ArrayList<>();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSONA");
			while (resultSet.next()) {
				Persona persona = new Persona();
				persona.setId(resultSet.getInt("id"));
				persona.setNombres(resultSet.getString("nombres"));
				persona.setApellidos(resultSet.getString("apellidos"));
				personas.add(persona);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personas;*/
		return null;
	}

	@Override
	public Persona listarPorId(Persona per) {
		/*Persona persona = new Persona();
		try {
			String query = "SELECT * FROM PERSONA WHERE ID =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				persona.setId(resultSet.getInt("id"));
				persona.setNombres(resultSet.getString("nombres"));
				persona.setApellidos(resultSet.getString("apellidos"));
				persona.setFoto(resultSet.getBytes("foto"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persona;*/
		return null;
	}

}
