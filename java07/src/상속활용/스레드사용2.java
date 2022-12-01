package 상속활용;

public class 스레드사용2 {
	public static void main(String[] args) {
		스레드1 num1 = new 스레드1();
		스레드2 num2 = new 스레드2();
		
		num1.start();
		num2.start();
	}

}
