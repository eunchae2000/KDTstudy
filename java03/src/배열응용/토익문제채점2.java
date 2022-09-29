package 배열응용;

import java.util.Random;

public class 토익문제채점2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 답안지, 대답안 공간만들어라.
		
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		
		// 2. 랜덤하게 만들어주는 부품을 만들어라.
		Random r = new Random();
		
		// 3. 990번 반복해서 답안지, 대답안에 숫자를 넣어라.
		for (int i = 0; i<답안지.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
		}
		
		// 4. 같은 인덱스끼리 990번 비교
		// 비교하다가 숫자가 동일하면 점수를 1 늘려주세요.
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안지[i] == 내답안[i]) {
				jumsu++; 
			}
		}
		
		// 5. 내 점수 프린트!
		System.out.println(jumsu);
	}

}
