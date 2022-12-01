<%@page import="db_connect.ProductVO"%>
<%@page import="db_connect.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    1. 입력
    2. 처리 (db처리 - dao, vo)
    3. 출력 (브라우저로 출력, html)
    -->
    <!-- 1. 데이터를 product_insert.html에서 입력해서 넘김 값을 받으면 될 것. -->
    
    <%
    // 스크립트릿 (scriptlet --> 자바코드를 쓰는 부분)
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String content = request.getParameter("content");
    String price = request.getParameter("price");
    String company = request.getParameter("company");
    String img = request.getParameter("img");
    
    ProductVO bag = new ProductVO();
    bag.setID(id);
    bag.setNAME(name);
    bag.setCONTENT(content);
    bag.setPRICE(Integer.parseInt(price));
    bag.setCOMAPNY(company);
    bag.setIMG(img);
    
    
    ProductDAO dao = new ProductDAO();
    dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 등록 정보 확인</h3>
<%= bag %>
id : <%= id %>
name : <%= name %>
content : <%= content %>
price : <%= price %>
company : <%= company %>
img : <%= img %>
<hr>
<a href="product_insert.html"></a>
</body>
</html>