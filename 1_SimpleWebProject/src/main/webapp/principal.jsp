<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Principal</title>
</head>
<body>
	<%
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		
		if(usuario.equalsIgnoreCase("cesar") && clave.equalsIgnoreCase("cesar")){
			out.print("Bienvenido " + usuario);
		}else{
			out.print("Usuario/Clave incorrecto");
		}
		
	%>
	
	<!-- JSP Expression tag -->
	<br />
	[JDK 1.7] Fecha y Hora del sistema: <%= java.util.Calendar.getInstance().getTime() %>
	<br />
	[JDK 1.8] Fecha y Hora del sistema: <%= java.time.LocalDate.now() %>

</body>
</html>