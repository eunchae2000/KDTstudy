
<%@page import="db_connect.MovieVO"%>
<%@page import="db_connect.MovieDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
MovieDAO dao = new MovieDAO();
ArrayList<MovieVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body style="text-algin: center">

	<h3>
		게시물 전체 개수 :
		<%=list.size()%>
		개
	</h3>
	<table class="table-dark table" border="1" style="font-size:30px">

		<tr>
			<th>영화 번호</th>
			<th>영화 제목</th>
			<th>영화 장르</th>
			<th>영화 이미지</th>
		</tr>
		<%
		for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getMovie_id()%></td>
			<td><a
				href="http://localhost:8080/web01/movie_one.jsp?movie_id=<%=list.get(i).getMovie_id()%>"><%=list.get(i).getMovie_title()%></a></td>
			<td><%=list.get(i).getMovie_genre()%></td>
			<td><a href="<%= list.get(i).getMovie_url()%>"><img src="img/<%=list.get(i).getMovie_img()%>" height="200px" width="150px"></a></td>
		</tr>
		<%
		}
		%>

	</table>



</body>
</html>