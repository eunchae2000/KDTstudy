package 스레드;

public class 배열스레드 extends Thread {
	String[] s = {"감자", "고구마", "양파", "국수", "짜장면"};
	@Override
	public void run() {
		for (int i = 0; i<s.length; i++) {
			System.out.println("음식이름: " + s[i]);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
