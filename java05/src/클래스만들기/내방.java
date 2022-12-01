package 클래스만들기;

import 클래스만들기.전화기;
import 클래스만들기.강아지;

public class 내방 {

	public static void main(String[] args) {
		// 전화기 한대 넣어보세요.
		전화기 p1 = new 전화기();
		//p1은 참조형 변수(주소)
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		
		p1.통화하다();
		p1.사진을찍다();
		
		전화기 p2 = new 전화기();
		p2.size = 0;
		p2.speaker = "메론사";
		p2.카톡을하다();
		
		강아지 p3 = new 강아지();
		System.out.println(p3);
		p3.color = "검정색";
		p3.field = "리트리버";
		
		System.out.println(p3.color);
		System.out.println(p3.field);
		
		p3.꼬리를흔들다();
		p3.짖다();
		
	}

}
