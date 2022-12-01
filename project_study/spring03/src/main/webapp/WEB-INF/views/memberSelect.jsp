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
검색한 사용자 입니다!
<hr>
<c:forEach var="vo" items="${list}">
검색한 id: ${vo.id} <br>
검색한 pw: ${vo.pw} <br>
검색한 name: ${vo.name} <br>
검색한 tel: ${vo.tel} <br>
검색한 company: ${vo.company} <br>
<hr color="red">
</c:forEach>
</body>
</html>