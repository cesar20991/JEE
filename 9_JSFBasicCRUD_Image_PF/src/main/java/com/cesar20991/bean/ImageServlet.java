package com.cesar20991.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cesar20991.dao.PersonaDAO;
import com.cesar20991.dao.PersonaDAOImpl;
import com.cesar20991.model.Persona;

@WebServlet("/imagen/*")
public class ImageServlet extends HttpServlet {

	private PersonaDAO dao;

	public ImageServlet() {
		dao = new PersonaDAOImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //
		int id = Integer.parseInt(req.getPathInfo().substring(1)); //captura el id de la url dado en @webServlet
		Persona per;
		
		try {
			per = dao.listarPorId(id);
			resp.setContentType(getServletContext().getMimeType(per.getApellidos()));
			resp.setContentLength(per.getFoto().length);
			resp.getOutputStream().write(per.getFoto());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
