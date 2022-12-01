<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

	<table border="1" class="table table-success table-striped">
		<th>도서 번호</th>
		<th>도서 제목</th>
		<th>도서 작가</th>
		<th>도서 출판사</th>
		<c:forEach var="dto" items="${list}">
			<tr>
				<!-- 첫번째 줄 시작 -->
				<td>${dto.id}</td>
				<td>${dto.title}</td>
				<td>${dto.writer}</td>
				<td>${dto.publish}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>