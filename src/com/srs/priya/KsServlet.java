package com.srs.priya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class KsServlet
 */
@WebServlet("/KsServlet")
public class KsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int k=(int)session.getAttribute("k");
		
		k=k*k;
		
		PrintWriter out=response.getWriter();
		out.println("Result is" + k);
		System.out.println("sq called");
	}

}
