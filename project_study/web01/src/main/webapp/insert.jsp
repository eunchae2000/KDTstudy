
<%@page import="db_connect.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="db_connect.MemberVO" %>

<!-- 1. 데이터를 받아서, 3. sql문을 만들어서, 3. 결과를 html로 만들어야 하는 페이지 -->
<!-- java 코드 처리부분 + html로 만들어진 부분(jsp) -->
<!-- 2. 데이터를 받자! -->
<%

// 자바코드를 일부 넣는 부분, 작은 프로그램의 일부분
// 자바코드를 그냥 스크립트 쓰듯이 쓰면 됨.
// 스크립트릿(scriptlet)
// HttpRequestServlet request = new HttpRequestServelt(); 내장된 객체
// 미리 request라는 이름의 객체를 만들어서 제공함.

String id = request.getParameter("id");  // <input name="id">, 외부에서 입력한 데이터 타입 (String)
String pw = request.getParameter("pw");  
String name = request.getParameter("name"); 
String tel = request.getParameter("tel");  

MemberVO bag = new MemberVO();
bag.setId(id);
bag.setPw(pw);
bag.setName(name);
bag.setTel(tel);

MemberDAO dao = new MemberDAO();
dao.insert(bag);


// 2. sql문을 만들어서, db서버에 전송
// 3. 결과를 클라이언트에 html로 알려줌.

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink"></body>
<h2>회원가입이 되었습니다. 당신의 가입정보 입니다.</h2>
<hr>
가입한 id: <%= id %> <br>
가입한 pw: <%= pw %> <br>
가입한 name: <%= name %> <br>
가입한 tel: <%= tel %> <br>
<body>

</body>
</html>