<%@page import="com.multi.mvc200.BookDTO"%>
<%@page import="com.multi.mvc200.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	BookDAO dao = new BookDAO();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
도서 검색 결과입니다.
<hr/>
도서 번호 : ${dto.id} <br>
도서 제목 : ${dto.name} <br>
도서 사진 : <img src="resources/img/${dto.img}" width="200px" height="350px"> <br>
도서 주소 : <a href="${dto.url}">${dto.name}</a> <br>
</body>
</html>