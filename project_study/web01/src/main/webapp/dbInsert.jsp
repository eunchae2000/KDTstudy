<%@page import="db_connect.BoardDAO"%>
<%@page import="db_connect.boardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String no1 = request.getParameter("no");
int no = Integer.parseInt(no1);
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

boardVO bag = new boardVO();
bag.setNo(no);
bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);

BoardDAO dao = new BoardDAO();
dao.insert(no, title, content, writer);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<h2><%= writer %>님이 작성한 게시판 내용입니다.
	</h2>
	<hr style="height: 5px; background-color:blue">
	아이디 >>
	<%= no %>
	<br> 제목 >>
	<%= title %>
	<br> 내용 >>
	<%= content %>
	<br> 작성자 >>
	<%= writer %>
	<br>
	<hr style="height: 5px; background-color:blue">
	<a href="bbs.html"> 앞 페이지로 가기</a>
<body>
</html>