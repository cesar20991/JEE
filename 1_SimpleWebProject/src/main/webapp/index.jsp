<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% out.print("Tu dirección IP es " + request.getRemoteAddr()); %>
	
	<form action="principal.jsp" method="post">
		usuario <input type="text" name="usuario"/>
		clave <input type="text" name="clave"/> <br/>
		<input type="submit" name="iniciar">
	</form>

</body>
</html>