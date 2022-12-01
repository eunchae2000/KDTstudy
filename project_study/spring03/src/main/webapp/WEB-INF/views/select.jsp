<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body bgcolor = "lightgreen">
검색한 북마크 입니다!
<hr>
<c:forEach var="select" items="${list}">
검색한 id: ${vo.id} <br>
검색한 name: ${vo.name} <br>
검색한 url: ${vo.url} <br>
검색한 img: ${vo.img} <br>
<hr color="red">
</c:forEach>
</body>
</html>