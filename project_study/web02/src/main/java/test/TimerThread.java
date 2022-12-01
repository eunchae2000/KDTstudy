package test;

import java.util.Date;

//Thread 클래스를 상속받아서 CounterThread를 만들었음.
public class TimerThread extends Thread{
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			Date date = new Date();
			System.out.println("타이머>> " + date);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.5초, cpu자원을 자바가 요청!!
		}
	}
}
