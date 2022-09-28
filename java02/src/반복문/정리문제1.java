package 반복문;

public class 정리문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		for (int i = 33; i<=222; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for (int i = 55; i<=4500; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i = 0; i<=6000; i+=5) {
			sum3 += i;
		}
		System.out.println(sum3);
	}

}
