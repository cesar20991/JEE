package com.cesar20991.demo.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// 1. manera
// Servelet genérico - la primera manera - Esto era hace mas de 10 años

public class ExtendServlet extends GenericServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("*** INIT - Generic Servlet ");
	}

	@Override
	public void destroy() {
		System.out.println("*** Destroy - Generic Servlet ");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().write("<html><body>GenereicServlet</body></html>");
	}

}
