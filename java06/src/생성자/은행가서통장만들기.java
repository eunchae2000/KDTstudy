package 생성자;

import 생성자.통장;

public class 은행가서통장만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		통장 dad = new 통장("홍길동", "050505", 10000);
		
		System.out.println(dad.name);
		System.out.println(dad.ssn);
		System.out.println(dad.money);

	}

}
