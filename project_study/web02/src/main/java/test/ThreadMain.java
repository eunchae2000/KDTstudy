package test;

public class ThreadMain {
	public static void main(String[] args) {
		// 스레드 객체 3개 만들어주세요.
		CounterThread counter = new CounterThread();
		ImgThread img = new ImgThread();
		TimerThread timer = new TimerThread();

		Test1Thread test1 = new Test1Thread();
		Test2Thread test2 = new Test2Thread();
		Test3Thread test3 = new Test3Thread();
		
		//cpu한테 실행할 대기줄에 넣어주세요.
//		counter.start();
//		img.start();
//		timer.start();
		
		test1.start();
		test2.start();
		test3.start();
	}
}
