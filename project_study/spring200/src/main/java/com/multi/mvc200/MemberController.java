package com.multi.mvc200;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired // 이미 만들어서 준비된 MemberDAO 객체의 주소를 찾아서 자동으로 
				// 그 주소를 아래의 변수인 dao에 넣어주세요!!
	MemberDAO dao;
	
	@RequestMapping("insert.multi")
	public void insert(MemberDTO bag, MemberDAO dao) {
		System.out.println("클라이언트 회원가입 처리 요청됨");
		System.out.println(bag);
		
		// DAO를 이용해서 db처리를 해보자.
		// MemberDAO dao = new MemberDAO() //  프로토타입
		
		// insert 메서드의 변수로 선언해주면, 스프링이 프로토타입으로 만들어서 준다.
		dao.insert(bag);
		
	}
	
//	@RequestMapping("login.multi")
//	public String login(MemberDTO bag) {
//		System.out.println("클라이언트 로그인 처리 요청됨");
//		System.out.println(bag);
//		int result = dao.login(bag);
//		if (result==1) {
//			return "ok";
//		}else {
//			return "no";
//		}
//		
//	}
	
//	@RequestMapping("login.multi")
//	public String loginOld2(MemberDTO bag, MemberDAO dao) {
//		System.out.println("클라이언트 로그인 처리 요청됨");
//		System.out.println(bag);
//		int result = dao.login(bag);
//		if (result==1) {
//			return "ok";
//		}else {
//			return "no";
//		}
//		
//	}
	
	// 회원탈퇴처리
	@RequestMapping("delete.multi")
	public String delete(String id) {
		System.out.println("클라이언트 로그인 처리 요청됨");
		System.out.println("받은 아이디는 " + id);
		int result = dao.delete(id);
		// spring 프로그램에 어떤 이름의 파일을 호출할지 이름을 리턴해주세요
		if(result == 1) {
			return "ok";
		}else {
			return "no";
		}
	}
}
