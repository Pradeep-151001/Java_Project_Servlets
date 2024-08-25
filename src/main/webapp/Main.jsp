<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.IOException"%>
<%@ page import="jakarta.servlet.ServletException"%>
<%@ page import="jakarta.servlet.ServletRequest"%>
<%@ page import="jakarta.servlet.ServletResponse"%>
<%@ page import="jakarta.servlet.http.HttpServletRequest"%>
<%@ page import="jakarta.servlet.http.HttpServletResponse"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="jakarta.servlet.ServletConfig"%>
<%@ page import="jakarta.servlet.ServletContext"%>
<%@ page import="jakarta.servlet.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<p>Hello World I am from JSP.</p>
	<% out.println("I am from Scriptlet tag"); %>
	<%! void disp(HttpServletResponse response,String a) { 
		try{
			PrintWriter out = response.getWriter();
			out.println(a);
			out.flush();
	}catch(IOException e){}} %>

	<% disp(response,"hi"); %>


	<%
	
	String name = request.getParameter("FirstName");
	out.println(name);
	String roll = request.getParameter("roll_no");
	out.println(roll);

	String name1 = request.getParameter("name");
	out.println(name1);

	String dept = request.getParameter("dept_id");
	out.println(dept);
	
	//String ctx = application.getServletContextName();
	//String data = application.getInitParameter("dname");
	//String data1 = config.getInitParameter("dname");
	//out.println(data + data1);
	//out.println(ctx + "Hi");
	
	
	%>
	
<!--  PageContext pagectx = Servlet.PageContext;-->

</body>
</html>

