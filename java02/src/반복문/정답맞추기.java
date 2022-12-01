package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0; // int는 보통 0으로 초기화시켜줌
		int no = 0;
		// TODO Auto-generated method stub
		while(true) { // 무한루프
			String data = JOptionPane.showInputDialog("숫자입력");
			count++; // count++; 증감연산자, 1씩 증가/감
			int data2 = Integer.parseInt(data);
			if(data2 == target) {
				System.out.println("정답입니다. 축하합니다.");
				// 무한루프를 반드시 끝내는 처리를 해야함.
				// break; //while 종료 
				System.out.println("전체 시도횟수는 " + count);
				System.out.println("틀린 시도횟수는 " + no);
				System.exit(0); // 정답맞추기 게임 프로그램을 종료
			}else {
				no ++;
				System.out.println("정답이 아닙니다.!!");
				
				// 입력한 값이 정답보다 큰지, 작은지를 알려주세요.
				if(data2>target) {
					System.out.println("너무 커요");
				}else {
					System.out.println("너무 작아");
				}
			}
		}
	}

}
