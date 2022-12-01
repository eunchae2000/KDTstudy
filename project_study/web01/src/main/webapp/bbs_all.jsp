<%@page import="db_connect.boardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db_connect.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
BoardDAO dao = new BoardDAO();
ArrayList<boardVO> list = dao.list();
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

	<h3>
		게시물 전체 개수 :
		<%=list.size()%>
		개
	</h3>
	<table class="table-dark table" border="1">

		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
		</tr>
		<%
		for (int i=0; i<list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getNo()%></td>
			<td><a href="http://localhost:8080/web01/bbs_one.jsp?no=<%= list.get(i).getNo()%>"><%=list.get(i).getTitle()%></a></td>
			<td><%=list.get(i).getContent() %></td>
			<td><%=list.get(i).getWriter()%></td>
		</tr>
		<%
		}
		%>

	</table>



</body>
</html>