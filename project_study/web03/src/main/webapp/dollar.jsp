<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String dollar2 = request.getParameter("dollar");
int dollar = Integer.parseInt(dollar2);

int won = dollar*1324;

%>

<%= won %>