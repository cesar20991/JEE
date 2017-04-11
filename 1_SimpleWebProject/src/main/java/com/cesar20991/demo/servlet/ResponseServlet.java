package com.cesar20991.demo.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setContentType("application/pdf");
		//resp.setHeader("Content-Disposition", "attachment; filename='calendarioNoviembre.pdf'"); // esto es opcional
		resp.setContentType("image/jpg");
		
		ServletOutputStream out;
		out = resp.getOutputStream();
		
		//String relativeWebPath = "/WEB-INF/resources/pdf/Calendario-Noviembre.pdf";
		//String relativeWebPath = "/WEB-INF/resources/images/corea.jpg";
		String relativeWebPath = "/resources/images/corea.jpg";
		InputStream fin = getServletContext().getResourceAsStream(relativeWebPath);
		
		BufferedInputStream bin = new BufferedInputStream(fin); //esta clase me permite trabajar con arreglod e bytes
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int ch = 0;
		
		while((ch = bin.read()) != -1){ // Lee hasta que no haya datos
			bout.write(ch);
		}
		bin.close();
		fin.close();
		bout.close();
		out.close();
	}
	
	

}
