package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDAO {
	
	// mybatis를 끼자
	@Autowired
	SqlSessionTemplate my;
	
	public BookVO one(BookVO vo) {
		BookVO bag = my.selectOne("book.one", vo);
		return bag;
	}
	
	public List<BookVO> select() {
		return my.selectList("book.select");
	}
	
	public void insert(BookVO vo) {
		my.insert("book.create", vo);
	}
	
	public void update(BookVO vo) {
		my.update("book.update", vo);
	}
	
	public void delete(BookVO vo) {
		my.delete("book.delete", vo);
	}
}
