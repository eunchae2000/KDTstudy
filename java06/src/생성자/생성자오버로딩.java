package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 생성자오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JFrame f2 = new JFrame("나는 제목");
		
		JButton b = new JButton();
		JButton b2 = new JButton("나는 버튼 글자");
		
		Font font = new Font("궁서", 1, 50);
		b2.setFont(font);
		
		f2.setSize(300, 300);
		f2.add(b2);
		
		f2.setVisible(true);
	}

}
