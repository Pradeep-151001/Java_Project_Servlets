package com.google.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Sample extends HttpServlet {

//	private String var1 = "Hello World!";
//	private int n = 5;
//	private int i, j;

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
			req.getRequestDispatcher("Main.jsp").forward(req, res);
		
	}
}
