package 스레드;

public class 스레드사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();
		t2.start();

	}

}
