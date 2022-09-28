package 조건문;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String course = sc.next();
		switch(course) {
		case "자바":
			System.out.println("JSP로 점프");
			break;
		case "파이썬":
			System.out.println("장고로 점프");
			break;
		default:
			System.out.println("무조건 열심히!");
			break;
		}

	}

}
