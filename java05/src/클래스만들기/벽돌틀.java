package 클래스만들기;

public class 벽돌틀 {
	
	// 하드웨어 개념
	// 속성(성질) == property, attribute
	// 기능(동작) == function, 함수
	// 틀을 만들기 위해서는 물건들이 가지는 공통된 속성, 동작을
	// 정의해야함.
	// 속성 --> x, y (멤버변수)
	public int x;  // 멤버변수는 자동초기화(0) int x = 0;
	public int y; // int y = 0;
	
	// 동작 --> 쌓다. (동사형태, 멤버메서드)
	// public : 접근 제어자. 아무 패키지나 다 접근 가능
	public void 쌓다() {
		// 쌓다라는 어떤 것들을 처리해 준다(동작한다)라고
		// 정의. 여러줄 가능!!!
		System.out.println("벽돌을 쌓다.");
	}
}
