package 반복문;

public class For문연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=0; i<=10000; i++) {
			//1부터 1씩 증가하면서 10까지 처리!!
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("----------");
		// 3~11까지 더해보세요.
		// 초기값(시작값); 조건식; 증감식
		int sum2 = 0;
		for (int i = 3; i<=11; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	}

}
