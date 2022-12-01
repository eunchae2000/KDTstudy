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
	<form action="insertBookStore.multi">
		도서 제목: <input name="title"> <br> 도서 작가: <input
			name="writer"> <br> 도서 출판사: <input name="publish">
		<br>
		<button>도서 등록 완료</button>
	</form>
	<hr>
	<h3>도서 삭제하기</h3>
	<form action="deleteBookStore.multi">
		도서 번호 : <input name="id"> <br>
		<button>도서 검색 완료</button>
	</form>
	<hr>
	<h3>도서 수정하기</h3>
	<form action="updateBookStore.multi">
		도서 번호 : <input name="id"> <br> 도서 제목: <input name="title">
		<br> 도서 작가: <input name="writer"> <br> 도서 출판사: <input
			name="publish"> <br>
		<button>도서 등록 완료</button>
	</form>
	<hr>
	<h3>도서 검색하기</h3>
	<form action="oneBookStore.multi">
		도서 번호 : <input name="id"> <br> 
		<button>도서 검색 완료</button>
	</form>
	
	<!-- <a href="selectBookStore">도서 전체 목록 검색하기</a> -->
	<form action="selectBookStore.multi">
	<button>검색하기</button>
	</form>
</body>
</html>