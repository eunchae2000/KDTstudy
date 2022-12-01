package com.multi.mvc200;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@Autowired
	BookDAO dao;  // 주소가 들어가있음.
	
	
	@RequestMapping
	public void delete(int id) {
		dao.delete(id);
	}
	
	@RequestMapping("insert3.multi")
	public void insert3(BookDTO bag) {
		
		// 1. 데이터를 받아서 dto를 만들어서 집어 넣어라!
		System.out.println(bag);
		
		// 2. dao에 dto를 주고 insert 해달라고 요청해라!
		dao.insert(bag);
		
		// 3. 결과를 알려주는 페이지를 호출(insert2.jsp를 호출함: 자동으로!!)
		
	}
	
	@RequestMapping("select.multi")
	public void select(BookDTO bookDTO, Model model) {
		BookDTO dto = dao.one(bookDTO);
		model.addAttribute("dto", dto);
	}
}
