package test;

public class CounterThread extends Thread{
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("1씩 카운터>> " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.5초, cpu자원을 자바가 요청!!
		}
	}
}
