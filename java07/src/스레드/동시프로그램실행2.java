package 스레드;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		카운터스레드 counter = new 카운터스레드();
		시각스레드 time = new 시각스레드();
		배열스레드 array = new 배열스레드();
		
		// cpu에 동시에 처리되도록 등록!!
		counter.start();
		time.start();
		array.start();
		
	}

}
