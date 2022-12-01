package 연습;

public class 형변환연습 {
	public static void main(String[] args) {
		int a = 100; // 4개(대)
		byte b = 50; // 1개(작)
		a = b; // <--- byte
		//타입변환(형변환)
		//큰공간 <-- 작은공간데이터(자동형변환)
		      
		int c = 100; // 4개(대)
		b = (byte) c;
		//작은공간 <-- 큰공간데이터(강제형변환)
		//(작은공간이름)변수;
		//조심할 것은 작은 공간에 들어갈 수 있는 범위여야 한다.
		//byte -128~127
		System.out.println(b);
	}

}
