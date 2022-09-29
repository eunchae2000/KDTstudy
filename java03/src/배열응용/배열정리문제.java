package 배열응용;

public class 배열정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		int sum = 0;
		sum = arr1[0] + arr1[2];
		System.out.println(sum);
		
		String[] arr2 = new String[3];
		arr2[0] = "자바";
		arr2[1] = "스프링";
		arr2[2] = "JSP";
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);

	}

}
