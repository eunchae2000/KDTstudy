package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 형변환그래픽 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		
		JButton b = new JButton("나는 버튼");
		f.add(b);  // Component <--- Button
		
		JLabel l = new JLabel("나는 라벨");
		f.add(l);
		
		JTextField t = new JTextField("나는 텍스트필드");
		f.add(t);
		
		f.setVisible(true);
	}

}
