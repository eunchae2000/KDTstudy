<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원 정보 검색</h3>
<form action="memberOne">
아이디 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>

<h3>회원 전체 검색</h3>
<a href="memberSelect">
	<button>전체 검색 요청</button>
</a>
<hr>
<h3>회원 추가</h3>
<form action="memberInsert">
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="text" name="pw"><br>
이름 : <input type="text" name="name"><br>
전화번호 : <input type="text" name="tel"><br>
회사 : <input type="text" name="company"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>
<h3>회원 수정</h3>
<form action="memberUpdate">
아이디 : <input type="text" name="id"><br>
이름 : <input type="text" name="name"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>
<h3>회원 삭제</h3>
<form action="memberDelete">
아이디 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>
</body>
</html>