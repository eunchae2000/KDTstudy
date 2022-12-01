package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		// Object <- 자동형변환 - Integer <- 오토박싱 - int
		me.add(189.1);
		me.add(false);
		me.add("남");
		System.out.println(me);
		
		int money = (int)me.get(0) + 1000;
		System.out.println(money);
		// int <- 오토언박싱 - Integer <- 강제형변환 - Object
		
		double height = (double)me.get(1) + 10;
		System.out.println(height);
		
		boolean food = (boolean)me.get(2);
		if (food == false) {
			System.out.println("배고파요.");
		}else {
			System.out.println("배불러요.");			
		}
		
		char gender = (char)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1, 3이예요.");
		}else {
			System.out.println("주민번호는 2, 4예요.");			
		}
		
		
	}

}
