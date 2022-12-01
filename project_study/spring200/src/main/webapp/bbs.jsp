<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>
	<h3>게시판 글쓰기</h3>
	<form action="insert2.multi">
		no: <input name="no" >
		<br> 
		title: <input name="title">
		<br> 
		content: <input name="content">
		<br> 
		writer: <input name="writer">
		<br> 		
		<button>게시판 글쓰기 완료</button>
	</form>
<hr>
	<h3>게시판 글 삭제하기</h3>
	<form action="delete2.multi">
		no: <input name="no" value="test" >
		<br> 		
		<button>게시판 글 삭제 완료</button>
	</form>
</body>
</html>