<%@page import="db_connect.MemberVO"%>
<%@page import="db_connect.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    1. 데이터 받아오기
    2. db 처리
    3. 결과출력 (html) -->

<%
String id = request.getParameter("id");
    
MemberDAO dao = new MemberDAO();
MemberVO bag = dao.one(id);
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>
	<h3>하나의 게시글 검색된 결과 입니다.</h3>
	<hr>
	아이디: <%= bag.getId() %>
	<br> 비밀번호:
	<%= bag.getPw() %><br> 이름:
	<%= bag.getName() %>
	<br> 전화번호:
	<%= bag.getTel() %>
	<br>

	<table border="1" class="table-dark table">
		<thead>
			<tr>
				<th>항목명</th>
				<th>데이터</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>아이디</td>
				<td><%= bag.getId() %></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%= bag.getPw() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= bag.getName() %></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%= bag.getTel() %></td>
			</tr>
		</tbody>
	</table>


</body>
</html>