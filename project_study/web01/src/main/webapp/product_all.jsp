<%@page import="db_connect.ProductVO"%>
<%@page import="db_connect.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
ProductDAO dao = new ProductDAO();
ArrayList<ProductVO> list = dao.list();
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
	<table class="table-dark table" border="1">

		<tr>
			<th>상품 번호</th>
			<th>상품 이름</th>
			<th>상품 설명</th>
			<th>상품 가격</th>
			<th>상품 회사</th>
			<th>상품 이미지</th>
		</tr>
		<%
		for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getID()%></td>
			<td><a
				href="http://localhost:8080/web01/product_one.jsp?id=<%=list.get(i).getID()%>"><%=list.get(i).getNAME()%></a></td>
			<td><%=list.get(i).getCONTENT()%></td>
			<td><%=list.get(i).getPRICE()%></td>
			<td><%=list.get(i).getCOMAPNY()%></td>
			<td><img src="img/<%=list.get(i).getIMG()%>" height="100px" width="100px"></td>
		</tr>
		<%
		}
		%>

	</table>



</body>
</html>