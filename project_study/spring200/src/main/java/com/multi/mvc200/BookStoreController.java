package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookStoreController {
	
	@Autowired
	BookStoreDAO dao;  // 주소가 들어가있음.
	
	@RequestMapping("insertBookStore.multi")
	public void insert(BookStoreDTO bag) {
		
		// 1. 데이터를 받아서 dto를 만들어서 집어 넣어라!
		System.out.println(bag);
		
		// 2. dao에 dto를 주고 insert 해달라고 요청해라!
		dao.insert(bag);
		
		// 3. 결과를 알려주는 페이지를 호출(insert2.jsp를 호출함: 자동으로!!)
		
	}
	
	@RequestMapping("oneSelectBookStore.multi")
	public void oneSelect(int id, String title, String writer, String publish) {
		dao.update(id, title, writer, publish);
	}
	
	@RequestMapping("updateBookStore.multi")
	public void update(int id, String title, String writer, String publish) {
		dao.update(id, title, writer, publish);
	}
	
	@RequestMapping("oneBookStore.multi")
	public void one(BookStoreDTO bookStoreDTO, Model model) {
		BookStoreDTO dto = dao.one(bookStoreDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectBookStore.multi")
	public void select(Model model) {
		ArrayList<BookStoreDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
}
