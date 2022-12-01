package 배열응용;

import java.util.Scanner;

public class String연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
	    String num = sc.next();
	      
	    String[] num1 = num.split("-");
	      
	    if (num.substring(0, 3).equals("011")) {
	    	System.out.println("SK");
	    } else if (num.substring(0, 3).equals("019")) {
	        System.out.println("LG");
	    } else {
	        System.out.println("Apple");
	    }
	      
	    if (num1[1].length() >= 4) {
	        System.out.println("최신폰");
	    } else {
	        System.out.println("올드폰");
	    }
	      
	    int total_length = 0;
	    for (int i = 0; i < num1.length; i++) {
	       total_length += num1[i].length();
	    }
	      
	    if (total_length >= 10) {
	       System.out.println("유효한 전화번호");
	    } else {
	       System.out.println("유요하지 않은 전화번호");
	    }
	      
	    String s2 = "감자,고구마,양파";
	    String[] s3 = s2.split(",");
	      
	    System.out.println(s3[0]);

	}

}
