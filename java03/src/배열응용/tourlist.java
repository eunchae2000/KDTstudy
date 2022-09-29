package 배열응용;

import java.util.Scanner;

public class tourlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lasttour = new String[3];
		String[] thistour = new String[3];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("작년에 가고 싶었던 곳 세 곳을 입력받아 넣으세요.");
		for (int i = 0; i<lasttour.length; i++) {
			String last = sc.next();
			lasttour[i] = last;
		}
		
		System.out.println("올해에 가고 싶었던 곳 세 곳을 입력받아 넣으세요.");
		for (int i = 0; i<thistour.length; i++) {
			String year = sc.next();
			thistour[i] = year;
		}
		
		for (int i = 0; i<thistour.length; i++) {
			if(lasttour[i].equals(thistour[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳이 동일한 곳은 몇 곳인가? " + count);
		

	}

}
