package 순차문;

import java.util.Scanner;

public class 콘솔입력연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("나의 이름은? ");
		Scanner name = new Scanner(System.in);
		String name1 = name.next();
		
		System.out.print("나의 키는? ");
		Scanner height = new Scanner(System.in);
		Double height1 = height.nextDouble();
		
		System.out.print("나의 몸무게는? ");
		Scanner weight = new Scanner(System.in);
		Double weight1 = weight.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요? ");
		Scanner dinner = new Scanner(System.in);
		Boolean dinner1 = dinner.nextBoolean();
		
		System.out.print("나의 좌우명은? ");
		Scanner motto = new Scanner(System.in);
		String motto1 = motto.nextLine();
		
		System.out.println("--------------------");
		System.out.println("내 이름은 " + name1 + "입니다.");
		System.out.println("내 내년 키 " + (height1+10.0) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight1-10.0) + "입니다.");
		System.out.println("나는 저녁을 " + dinner1 + "했습니다.");
		System.out.println("나의 좌우명은 " + motto1 + "입니다.");
		
		

	}

}
