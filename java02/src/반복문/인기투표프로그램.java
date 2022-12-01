package 반복문;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu = 0;
		int u = 0;
		int bts = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("입력 1) 아이유 2) 유재석 3) 방탄 4) 종료");
			int vote = sc.nextInt();
			if(vote == 1) {
				iu++;
			}else if(vote ==2) {
				u++;
			}else if(vote == 3){
				bts++;
			}else {
				System.out.println("없는 번호입니다. 다시 선택해주세요.");
			}
			if (vote==4) {
				System.out.println("인기투표를 종료합니다.");
				System.out.println("아이유: " + iu);
				System.out.println("유재석: " + u);
				System.out.println("방탄소년단: " + bts);
				break;
			}
		}
		
	}

}
