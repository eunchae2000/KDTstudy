package 변수;

public class 기본데이터2 {
	public static void main(String[] args) {
		//정수 ==> 나이, 지갑, 금액, 우주
		byte age = 100; // 127이하(1바이트)
		short wallet = 20000; //(2바이트)
		int money = 500000000; // 21억(4바이트)
		long space = 10000000000L; //21억이상(8바이트)
		
		// 실수 ==> 몸무게, 키
		double height = 185.5;
		float weight = 88.8F;
		
		//문자1 ==> '' (2바이트)
		char gender = '남';
		
		//논리 ==> true/false
		boolean todayFinished = false;
		
		//특별한 부품, 기본형은 아님.
		// String(문자열)
		String name = "홍길동";
		System.out.println(name);
	}

}
