package com.google.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.google.www.config.DbConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddUser extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
		req.getRequestDispatcher("Main.jsp").forward(req, res);
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		String rollno = req.getParameter("rollno");
		String dept_id = req.getParameter("dept_id");
		
		
//		int roll ;
//		int dept ;
//		
		
		Users user = new Users();
		
		int flag = 0;
		
		user.setName(name);
		user.setRollno(rollno);
		user.setDept_id(dept_id);
		
		System.out.println("user :" +user);
		
		try {
			flag = DbConnection.addUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (flag>0) {
			pw.print("User added successfully");
		}else {
			pw.print("Failed to add user");
		}
		pw.close();
		
		
	}
	
	
}
