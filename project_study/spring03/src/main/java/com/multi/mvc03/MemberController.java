package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("memberOne")
	public void one(MemberVO vo, Model model) {
		MemberVO result = dao.one(vo);
		model.addAttribute("vo",result);
	}
	
	@RequestMapping("memberSelect")
	public void select(Model model) {
		List<MemberVO> list = dao.select();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("memberInsert")
	public void insert(MemberVO vo) {
		// db 처리 해야함
		dao.insert(vo);
		// 처리 결과를 views/insert.jsp를 호출해서 넣을 예정
		
	}
	
	@RequestMapping("memberUpdate")
	public void update(MemberVO vo) {
		// db 처리 해야함
		dao.update(vo);
		// 처리 결과를 views/insert.jsp를 호출해서 넣을 예정
		
	}
	
	@RequestMapping("memberDelete")
	public void delete(MemberVO vo) {
		// db 처리 해야함
		dao.delete(vo);
		// 처리 결과를 views/insert.jsp를 호출해서 넣을 예정
		
	}
	

}
