package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao;
	
	@RequestMapping("one")
	public void one(BookVO vo, Model model) {
		BookVO result = dao.one(vo);
		model.addAttribute("vo",result);
	}
	
	@RequestMapping("select")
	public void select(Model model) {
		List<BookVO> list = dao.select();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("insert.do")
	public void insert(BookVO vo) {
		// db 처리 해야함
		dao.insert(vo);
		// 처리 결과를 views/insert.jsp를 호출해서 넣을 예정
		
	}
	
	@RequestMapping("update.do")
	public void update(BookVO vo) {
		// db 처리 해야함
		dao.update(vo);
		// 처리 결과를 views/insert.jsp를 호출해서 넣을 예정
		
	}
	
	@RequestMapping("delete.do")
	public void delete(BookVO vo) {
		// db 처리 해야함
		dao.delete(vo);
		// 처리 결과를 views/insert.jsp를 호출해서 넣을 예정
		
	}
	

}
