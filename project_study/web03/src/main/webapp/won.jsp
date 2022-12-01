<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String won1 = request.getParameter("won");
int won = Integer.parseInt(won1);

int dollar = won%1324;

%>

<%= dollar %>