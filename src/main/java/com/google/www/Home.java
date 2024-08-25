package com.google.www;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Home extends HttpServlet {

	private String var1 = "Hello World!";
	private String var2 = "This is sample app";
	private String var3 = "Running on Server!";
	private int var4 = 7;

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
			req.getRequestDispatcher("Main.jsp").forward(req, res);
//			PrintWriter printable = res.getWriter();
//			printable.println(var1);
//			printable.println(var2);
//			printable.println(var3);
//			printable.println(var4);
//
//			printable.println();
//
//			for (int i = 0; i <= 5; i++) {
//				for (int j = i; j < 5; j++) {
//					printable.print("*");
//				}
//				printable.println();
//			}

		
	}
}
