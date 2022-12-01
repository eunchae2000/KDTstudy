package 순차문;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 콘솔입력연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나에 대한 정보");
		System.out.println("--------------------");
		System.out.print("이름 입력>> ");
		Scanner name = new Scanner(System.in);
		String name1 = name.next();
		System.out.print("나이 입력>> ");
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		System.out.print("취미 입력>> ");
		Scanner hobby = new Scanner(System.in);
		String hobby1 = name.next();
		System.out.println("--------------------");
		System.out.println("나의 이름은 " + name1);
		System.out.println("나의 나이는 " + age1);
		System.out.println("나의 취미 " + hobby1 + "입니다!");
		
		
//		JButton b1 = new JButton();
//		JButton b2 = new JButton();
//		JFrame f = new JFrame();
//		JTextField t1 = new JTextField();
//		JTextField t2 = new JTextField();
//		JTextArea ja = new JTextArea();
//		Random r = new Random();
//		Date date = new Date();
//		Scanner sc = new Scanner(System.in);

	}

}
