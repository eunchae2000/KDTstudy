<%@page import="db_connect.MemberVO"%>
<%@page import="db_connect.MemberDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db_connect.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
MemberDAO dao = new MemberDAO();
ArrayList<MemberVO> list = dao.list();
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
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>전화번호</th>
		</tr>
		<%
		for (MemberVO bag : list) {
		%>
		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getPw()%></td>
			<td><%=bag.getName()%></td>
			<td><%=bag.getTel()%></td>
		</tr>
		<%
		}
		%>

	</table>



</body>
</html>