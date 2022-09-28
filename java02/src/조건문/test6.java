package 조건문;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x>y) {
			System.out.println("앞 숫자가 크다.");
			System.out.println("n1: " + x);
			System.out.println("n2: " + y);
		}else {
			System.out.println("뒷 숫자가 크다.");
			System.out.println("n1: " + x);
			System.out.println("n2: " + y);
		}
	}

}
