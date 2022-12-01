package 반복문;

import java.util.Scanner;

public class 정답맞추기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		while (true) {
			
			System.out.print("숫자입력1>> ");
			int n1 = sc.nextInt();
			System.out.print("숫자입력2>> ");
			int n2 = sc.nextInt();
			if (n1 > n2) {
				System.out.println("앞 숫자가 더 큽니다.");
				count1++;
			} else if (n1 == n2) {
				System.out.println("더 숫자가 동일함.");
			} else {
				System.out.println("뒷 숫자가 더 큽니다.");
				count2++;
			}
			System.out.print("더 하시겠습니까? 종료(x), 계속(o)>> ");
			String exit = sc.next();
			char exit2 = exit.charAt(0); //첫번째 문자1개를 가지고 오세요.!
			if (exit2 == 'x') {
				System.out.println("게임을 종료합니다.!!");
				System.out.println("앞 숫자가 더 큰 횟수: " + count1);
				System.out.println("뒷 숫자가 더 큰 횟수: " + count2);
				System.exit(0);
			}
		}
	}

}
