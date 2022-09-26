package 변수;

public class 기본데이터 {

	public static void main(String[] args) {
		// 정수, 실수, 문자1, 논리
		// ram에 넣어보자.
		int age = 100; // 정수
		double height = 122.2; //실수
		char gender = ' '; // 문자1 ==> ''(싱글따옴표)
		boolean food = true; // 논리 ==> true(1)/false(0)
		
		//기본데이터는 아닌데, 사람이 기본데이터처럼 너무 많이 써서
		// 사용도 기본데이터처럼 할 수 있는 특별한 부품. String
		String name = "홍길동";
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age + "입니다.");	
		System.out.println("나의 키는 " + height + "입니다.");	
		System.out.println("나의 성별은 " + gender + "입니다.");	
		System.out.println("내가 밥을 먹었는지 여부 " + food + "입니다.");	
	}
	
}
