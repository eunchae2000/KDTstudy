package 반복문;

public class 정리문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i<=1000; i+=3) {
			if (i%5 == 0) {
				continue;
			}else if(sum>100) {
				System.out.println("더하기 종료");
				break;
			}else {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
