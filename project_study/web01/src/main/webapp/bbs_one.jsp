<%@page import="db_connect.boardVO"%>
<%@page import="db_connect.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    1. 데이터 받아오기
    2. db 처리
    3. 결과출력 (html) -->
    
    <%
    String no = request.getParameter("no");
    
    BoardDAO dao = new BoardDAO();
    boardVO bag = dao.select(Integer.parseInt(no));
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
번호: <%= bag.getNo() %><br>
제목: <%= bag.getTitle() %> <br>
내용: <%= bag.getContent() %> <br>
작성자: <%= bag.getWriter() %> <br>

<table border="1" class="table-dark table">
 <thead>
      <tr>
        <th>항목명</th>
        <th>데이터</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>게시물 번호</td>
        <td><%= bag.getNo() %></td>
      </tr>
      <tr>
        <td>게시물 제목</td>
        <td><%= bag.getTitle() %></td>
      </tr>
       <tr>
        <td>게시물 내용</td>
        <td><%= bag.getContent() %></td>
      </tr>
       <tr>
        <td>게시물 작성자</td>
        <td><%= bag.getWriter() %></td>
      </tr>
    </tbody>
</table>


</body>
</html>