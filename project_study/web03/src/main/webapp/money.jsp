<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String money1 = request.getParameter("money");
int money = Integer.parseInt(money1);
String choice = request.getParameter("choice");

if (choice.equals("1")){
	money = money - 1000;
}else if(choice.equals("2")){
	money = money + 1000;
}else if(choice.equals("3")){
	money = money;
}

%>

최종 결제 금액은 <%=  money %>