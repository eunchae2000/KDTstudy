package com.multi.mvc200;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;  // 주소가 들어가있음.
	
	@RequestMapping("insert2.multi")
	public void insert2(BbsDTO bag) {
		
		// 1. 데이터를 받아서 dto를 만들어서 집어 넣어라!
		System.out.println(bag);
		
		// 2. dao에 dto를 주고 insert 해달라고 요청해라!
		dao.insert(bag);
		
		// 3. 결과를 알려주는 페이지를 호출(insert2.jsp를 호출함: 자동으로!!)
		
	}
	
	@RequestMapping("delete2.multi")
	public void delete2(BbsDTO bag) {
		System.out.println("가방으로 전달받은 id: " + bag.getNo());
		System.out.println("가방으로 전달받은 title: " + bag.getTitle());
		System.out.println("가방으로 전달받은 content: " + bag.getContent());
		System.out.println("가방으로 전달받은 writer: " + bag.getWriter());
	}

}
