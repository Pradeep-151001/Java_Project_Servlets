package com.google.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormClass extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
		//req.getRequestDispatcher("Main.jsp").forward(req, res);
		//res.sendRedirect("requestfile.html");
		ServletConfig sg = getServletConfig();
		ServletContext sc = getServletContext();
		String context = sc.getInitParameter("FirstName");
		String driver = sg.getInitParameter("dname");
		
		Enumeration<String> e = sc.getInitParameterNames();
		PrintWriter pr = res.getWriter();
		String value = "";
		List<String> li = new ArrayList<>();
		
		while(e.hasMoreElements()) {
			value = e.nextElement();
			pr.print(sc.getInitParameter(value));
			li.add(sc.getInitParameter(value));
		}
		
		pr.print(driver + context+ "\n" + li);
	
}
	
	
//	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
//		//req.getRequestDispatcher("Main.jsp").forward(req, res);
//		//res.sendRedirect("requestfile.html");
//		
//		String name = req.getParameter("FirstName");
//		req.setAttribute("name",name);
//		req.getRequestDispatcher("Main.jsp").forward(req, res);
//	
//}
}
