package 상속활용;

public class 스레드사용 {

	public static void main(String[] args) {
		// 1. Thread 상속 받아 클래스를 3개 만들어놓음
		// 2. new 이용해서 객체사용
		시각스레드 시각 = new 시각스레드();
		이미지스레드 이미지 = new 이미지스레드();
		카운터스레드 카운터 = new 카운터스레드();
		
		// 3. 2번에서 만들어놓은 객체를 cpu 실행 목록에 등록 시작 
		시각.start();
		이미지.start();
		카운터.start();

	}

}
