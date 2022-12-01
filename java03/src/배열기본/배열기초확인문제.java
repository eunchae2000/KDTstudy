package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		System.out.println("배열 크기 출력 " + arr1.length);
		
		arr1[0] = 100;
		System.out.println("arr1[0] 출력 " + arr1[0]);
		
		arr1[arr1.length-1] = 500;
		System.out.println("arr1[arr1.length-1] 출력 " + arr1[arr1.length-1]);
		
		arr1[2] = 200;
		System.out.println("arr1[2] 출력 " + arr1[2]);
		
		for(int i =0; i<arr1.length; i++) {
			System.out.println(i +"번 째 " + arr1[i]);
		}
		
		
		for(int i =0; i<arr1.length; i++) {
			System.out.println("인덱스 " + i + " 배열의 데이터 " + arr1[i]);
		}
		

	}

}
