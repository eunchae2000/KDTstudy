package 배열기본;

public class 배열만들기2 {
	public static void main(String[] args) {
		//29page
		int[] num = new int[5];
		//num <-- {0, 0, 0, 0, 0}, length
		
		System.out.println("num의 주소>>" + num);
		// num은 참조형 변수(주소)
		
		// 값 대입, 위치값(index)를 이용!!
		num[0] = 100;
		num[1] = 200;
		
		for (int i =0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
	}

}
