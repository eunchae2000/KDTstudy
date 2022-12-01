
<%@page import="db_connect.ProductVO"%>
<%@page import="db_connect.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    1. 데이터 받아오기
    2. db 처리
    3. 결과출력 (html) -->
    
    <%
    String id = request.getParameter("id");
    
    ProductDAO dao = new ProductDAO();
    ProductVO bag = dao.one(id);
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
<%= bag.getID() %>

<table border="1" class="table-dark table">
 <thead>
      <tr>
        <th>항목명</th>
        <th>데이터</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>상품 번호</td>
        <td><%= bag.getID() %></td>
      </tr>
      <tr>
        <td>상품 명</td>
        <td><%= bag.getNAME() %></td>
      </tr>
       <tr>
        <td>상품 설명</td>
        <td><%= bag.getCONTENT() %></td>
      </tr>
       <tr>
        <td>상품 가격</td>
        <td><%= bag.getPRICE() %></td>
      </tr>
      <tr>
        <td>상품 회사</td>
        <td><%= bag.getCOMAPNY() %></td>
      </tr>
      <tr>
        <td>상품 이미지</td>
        <td><img src="img/<%= bag.getIMG() %>"></td>
      </tr>
    </tbody>
</table>


</body>
</html>