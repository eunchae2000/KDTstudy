package test;

import javax.swing.JOptionPane;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keyword = "p";
		String keyword1 = JOptionPane.showInputDialog("암호를 입력해주세요.");
		
		if(keyword == keyword1) {
			System.out.println("PASS!");
		}else {
			System.out.println("재입력!");
		}
	}

}
