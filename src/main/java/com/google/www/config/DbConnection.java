package com.google.www.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.www.Users;
import com.mysql.cj.log.Log;

public class DbConnection {
	


	static final String url = "jdbc:mysql://localhost:3305/javadb?useSSL=false";
	static final String user = "root";
	static final String password = "pradeep";

	public static Connection dbConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;

	}
	
	public static int addUser(Users user) throws SQLException, ClassNotFoundException{
		
		int result =0;
		String query= "INSERT INTO USERS(NAME,ROLLNO,DEPT_ID) VALUES(?,?,?)";
		
		Connection connect =  DbConnection.dbConnection();
		PreparedStatement ps = connect.prepareStatement(query);
		ps.setString(1,user.getName());
		ps.setLong(2,user.getRollno());
		ps.setLong(3,user.getId());
		
		result = ps.executeUpdate();
		connect.close();
		return result;
	}

}
