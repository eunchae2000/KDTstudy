package 클래스사용하기;
import 클래스만들기.계산기2;

public class 내가게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바는 "입력값이 다르면", 메서드 이름 동일해도 된다!!!
		계산기2 cal2 = new 계산기2();
		int result = cal2.add(200, 100);
		double result2 = cal2.add(100, 22.2);
		double result3 = cal2.add(11.3, 22.2);
		String result4 = cal2.add("ok", 100);
		
		int result5 = cal2.multi(3000, 4);
		cal2.div(result5, 4);
		
		// 메서드를 호출받고, 처리 값을 main이 받아와서
		// 아래코드 받아온 값을 이용해야 하는 경우, return 해야함.
		
		System.out.println("더한 값 1DMS");

	}

}
