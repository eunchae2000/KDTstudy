package test;

//Thread 클래스를 상속받아서 CounterThread를 만들었음.
public class Test3Thread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("@");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.5초, cpu자원을 자바가 요청!!
		}
	}
}
