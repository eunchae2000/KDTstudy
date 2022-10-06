package 스레드;

import java.util.Date;

public class 시각스레드 extends Thread{
	@Override
	public void run() {
		for(int  i = 0; i<500; i++) {
			Date date = new Date();
			System.out.println("현재: " + date);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
