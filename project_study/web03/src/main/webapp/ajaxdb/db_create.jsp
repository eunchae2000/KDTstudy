<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!-- jsp에서 자동 import  -->  
<%
String id = request.getParameter("id");
String email = request.getParameter("email");
String car = request.getParameter("car");

Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
String user = "scott";
String password = "tiger";
Connection con = DriverManager.getConnection(url, user, password);

String sql = "insert into person values (?, ?, ?)";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, id);
ps.setString(2, email);
ps.setString(3, car);

int result = ps.executeUpdate();

%>
    
			