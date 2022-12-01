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
	<h3>도서 등록하기</h3>
	<form action="insert3.multi">
		도서 제목: <input name="name">
		<br> 
		도서 사진: <input name="img">
		<br> 
		도서 주소: <input name="url">
		<br> 		
		<button>도서 등록 완료</button>
	</form>
<hr>
	<h3>도서 검색하기</h3>
	<form action="select.multi">
		도서 번호 : <input name="id">
		<br> 		
		<button>도서 검색 완료</button>
	</form>
</body>
</html>