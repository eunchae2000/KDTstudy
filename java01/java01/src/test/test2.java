package test;

import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yesterday = JOptionPane.showInputDialog("어제의 몸무게: ");
		String today = JOptionPane.showInputDialog("오늘의 몸무게: ");
		Double yesterday2 = Double.parseDouble(yesterday);
		Double today2 = Double.parseDouble(today);
		
		if ((yesterday2-today2) > 2) {
			System.out.println("다이어트 성공!");
		}else {
			System.out.println("다이어트 실패!");
		}
	}

}
