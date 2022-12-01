package test;

import javax.swing.JOptionPane;

public class test3 {
	public static void main(String[] args) {
		String keyword = "p";
		String keyword1 = JOptionPane.showInputDialog("암호를 입력해주세요.");
		
		String yesterday = JOptionPane.showInputDialog("어제의 몸무게: ");
		String today = JOptionPane.showInputDialog("오늘의 몸무게: ");
		Double yesterday2 = Double.parseDouble(yesterday);
		Double today2 = Double.parseDouble(today);
		
		if ( keyword==keyword1 && (yesterday2-today2) > 2) {
			System.out.println("오늘은 성공!");
		}else {
			System.out.println("내일 다시 도전!");
		}
		
	}

}
