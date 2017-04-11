package com.cesar20991.dao;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

	protected static Connection cx;
	
	public static Connection conectar(){
		if(cx!=null){
			return cx;
		}
		
		//File archivo=new File("db.properties");
		//InputStream inputStream = Conexion.class.getClassLoader().getResourceAsStream(archivo.getPath());
		
		//Para probar desde main - quitar el /. Desde Web mantener el /
		InputStream inputStream = Conexion.class.getClassLoader().getResourceAsStream("/db.properties");
		Properties properties = new Properties();
				
		try{
			properties.load(inputStream);
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			Class.forName(driver); //commprobador validando si esta el conector o no
			cx = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return cx;
	}
	
	public static void desconectar(){
		if(cx == null){
			return;
		}
		try{
			cx.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
