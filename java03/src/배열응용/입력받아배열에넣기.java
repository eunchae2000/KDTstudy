package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5]; // {0,0,0,0,0}
		
		for (int i =0; i<5; i++) {
			System.out.println("숫자 입력>> ");
			num[i] = sc.nextInt();
			// nextInt() String->int
		}
		int sum = 0;		
		for (int x: num) {
			sum += x;
		}
		System.out.println(sum);
		System.out.println(sum/5.0);
//		System.out.println("저장된 데이터는 " + data);
		
	}

}
