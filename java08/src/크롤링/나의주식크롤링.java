package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 나의주식크롤링 {
	private static JTextField textField;
	//버튼을 누를 때마다 textArea부분에 결과를 넣어주려면
	//아무곳에서나 접근이 가능해야함.
	//전역변수로 선언해주어야함.
	static JTextArea textArea;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		f.getContentPane().setBackground(new Color(190, 255, 170));
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("조선견고딕", Font.BOLD, 40));
		lblNewLabel.setBounds(120, 209, 166, 65);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("굴림", Font.BOLD, 40));
		textField.setBackground(Color.YELLOW);
		textField.setBounds(56, 270, 282, 50);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.BLUE);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 30));
		textArea.setBounds(49, 397, 289, 229);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("\uD06C\uB864\uB9C1 \uC2DC\uC791");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한 code를 가지고 와라!!
				//textField에 입력한 거!!!
				String code = textField.getText();//035420
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(code);
				textArea.setText(result);
			}
		});
		btnNewButton.setFont(new Font("조선견고딕", Font.BOLD, 30));
		btnNewButton.setBounds(56, 330, 284, 44);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0BC\uC131\uC804\uC790");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code를 주면서, 크롤링해달라고 하자.
				//크롤링연습6의 naver(code)호출!!
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("조선견고딕", Font.BOLD, 30));
		btnNewButton_1.setBounds(47, 25, 284, 44);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uCE74\uCE74\uC624");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("035720");
				textArea.setText(result);
			}
		});
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.setFont(new Font("조선견고딕", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(49, 93, 284, 44);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\uC0BC\uC131SDS");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("018260");
				textArea.setText(result);
			}
		});
		btnNewButton_1_1_1.setBackground(Color.PINK);
		btnNewButton_1_1_1.setFont(new Font("조선견고딕", Font.BOLD, 30));
		btnNewButton_1_1_1.setBounds(49, 155, 284, 44);
		f.getContentPane().add(btnNewButton_1_1_1);
		f.setSize(400, 700);
		f.setVisible(true);
	}
}
