package 순차문;

import java.util.Scanner;

public class 콘솔입력연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이클립스의 콘솔뷰에서 입력을 받아보자!!
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = sc.next(); // 입력을 받음. String!
		System.out.println("입력받은 이름은 " + name + "입니다.");
		

		System.out.println("소속을 입력: ");
		String com = sc.next();
		System.out.println("입력받은 소속은 " + com + "입니다.");
	}

}
