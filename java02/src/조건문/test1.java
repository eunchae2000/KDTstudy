package 조건문;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("암호를 대시오: ");
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		System.out.println(key);
		if (key == "pass") {
			System.out.println("들어오세요.");
		}else {
			System.out.println("나가세요.");			
		}
	}

}
