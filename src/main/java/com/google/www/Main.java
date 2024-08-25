package com.google.www;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

import com.google.www.config.DbConnection;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
 
public class Main extends HttpServlet {
	
	ArrayList<Users> ar = new ArrayList<>();
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		try {
		Connection con = DbConnection.dbConnection();
		String query = "SELECT * FROM USERS";
		PreparedStatement statement = con.prepareStatement(query);
		ResultSet result = statement.executeQuery();
		
		while(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			int roll = result.getInt("rollno");
			
			Users user = new Users(id,name,roll);
			ar.add(user);
			
		}
		result.close();
		statement.close();
		con.close();
		
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PrintWriter printer = res.getWriter();
			printer.println(ar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
