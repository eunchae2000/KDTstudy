<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- jsp에서 자동 import  -->
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String country = request.getParameter("country");

Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
String user = "scott";
String password = "tiger";
Connection con = DriverManager.getConnection(url, user, password);

/* String sql = "insert into animal values (?, ?, ?, ?)"; */
String sql = "select * from animal";
PreparedStatement ps = con.prepareStatement(sql);

ResultSet rs = ps.executeQuery();

String id1 = null;
String name1 = null;
String gender1 = null;
String country1 = null;

if(rs.next()){
id1 = rs.getString(1);
name1 = rs.getString(2);
gender1 = rs.getString(3);
country1 = rs.getString(4);
	
}


con.close();
ps.close();
%>

<%= id1 %>
<%= name1 %>
<%= gender1 %>
<%= country1 %>
