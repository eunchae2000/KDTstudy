package 추상클래스인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class 그래픽형변환 implements ActionListener{
	static JButton b1, b2, b3;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("버튼1");
		b1.setBounds(27, 25, 147, 29);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("버튼2");
		b2.setBounds(175, 25, 147, 29);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("버튼3");
		b3.setBounds(321, 25, 147, 29);
		f.getContentPane().add(b3);
		
		그래픽형변환 처리 = new 그래픽형변환();
		b1.addActionListener(처리);
		b2.addActionListener(처리);
		b3.addActionListener(처리);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent who) {
		// TODO Auto-generated method stub]
		System.out.println("내가 호출됨!...");
		System.out.println(who.getSource() == b1);
		if(who.getSource() == b1) {
			System.out.println("b1을 누르셨군요.");
		}else if(who.getSource() == b2) {
			System.out.println("b2를 누르셨군요.");
		}else {
			System.out.println("b3을 누르셨군요.");
		}
		

	}
}
