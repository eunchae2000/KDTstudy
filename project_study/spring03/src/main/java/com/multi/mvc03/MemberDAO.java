package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	// mybatis를 끼자
	@Autowired
	SqlSessionTemplate my;
	
	public MemberVO one(MemberVO vo) {
		MemberVO bag = my.selectOne("member.one", vo);
		return bag;
	}
	
	public List<MemberVO> select() {
		return my.selectList("member.select");
	}
	
	public void insert(MemberVO vo) {
		my.insert("member.insert", vo);
	}
	
	public void update(MemberVO vo) {
		my.update("member.update", vo);
	}
	
	public void delete(MemberVO vo) {
		my.delete("member.delete", vo);
	}
}
