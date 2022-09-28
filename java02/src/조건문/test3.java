package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String food = JOptionPane.showInputDialog("저녁에 먹을 음식 종류는 1) 짜장면, 2)우동, 3)라면");
		switch(food) {
		case "짜장면":
			System.out.println("중국집으로 가요!");
			break;
		case "우동":
			System.out.println("일식집으로 가요!");
			break;
		case "라면":
			System.out.println("분식집으로 가요!");
			break;
		default:
			System.out.println("집에서 먹어요!");
			break;
		}
	}

}
