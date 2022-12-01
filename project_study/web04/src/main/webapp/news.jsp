<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>메일화면</h3>
	<hr color="red">
	<%
	if (session.getAttribute("id") != null) {
	%>
	로그인한 사람
	<%=session.getAttribute("id")%>
	<br>
	<form action="amu.jsp">
		댓글: <input type="text" placeholder="댓글을 입력해주세요" id="reply">
		<button type="submit">댓글 달기</button>
	</form>
	<%
	} else {
	response.sendRedirect("login.html"); //페이지 자동 호출
	//브라우저야 login.html을 호출해!
	}
	%>
</body>
</html>