<%@page import="db_connect.MovieVO"%>
<%@page import="db_connect.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
    String no = request.getParameter("movie_id");
    
    MovieDAO dao = new MovieDAO();
    MovieVO bag = dao.one(no);
    %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
</head>
<body style="font-size:30px">
	<h3>영화 <%= bag.getMovie_title() %> 상세보기 입니다.</h3>
	<hr>

	<table border="1" class="table-dark table">
		<thead>
			<tr>
				<th>항목명</th>
				<th>데이터</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>영화 번호</td>
				<td><%= bag.getMovie_id() %></td>
			</tr>
			<tr>
				<td>영화 제목</td>
				<td><%= bag.getMovie_title() %></td>
			</tr>
			<tr>
				<td>영화 장르</td>
				<td><%= bag.getMovie_genre() %></td>
			</tr>
			<tr>
				<td>상품 이미지</td>
				<td> <a href="<%= bag.getMovie_url() %>"><img src="img/<%= bag.getMovie_img() %>"></a></td>
			</tr>
		</tbody>
	</table>
</body>
</html>