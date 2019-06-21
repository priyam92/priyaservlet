package com.srs.priya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet1() 
    {
        super();
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException 
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			try
			{
				int num1 = Integer.parseInt(request.getParameter("number1"));
				int num2 = Integer.parseInt(request.getParameter("number2"));
				int sum = num1 + num2;
				out.println(sum);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}		
	}


