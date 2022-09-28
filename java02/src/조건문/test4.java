package 조건문;

import java.util.Date;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int time = date.getHours();
		if(time<11) {
			System.out.println("굿모닝");
		}else if(time<15) {
			System.out.println("굿애프터");
		}else if(time<19) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
	}

}
