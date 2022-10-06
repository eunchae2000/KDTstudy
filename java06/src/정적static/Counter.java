package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel number = new JLabel("0");
		number.setForeground(new Color(255, 36, 0));
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setFont(new Font("조선로고체", Font.PLAIN, 99));
		number.setBounds(59, 137, 382, 299);
		f.getContentPane().add(number);
		
		JButton btnNewButton = new JButton("1 더하기");
		btnNewButton.setForeground(new Color(255, 162, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count+"");
			}
		});
		btnNewButton.setFont(new Font("조선로고체", Font.PLAIN, 20));
		btnNewButton.setBounds(22, 20, 129, 48);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0으로 초기화");
		btnNewButton_1.setForeground(new Color(84, 201, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number.setText("0");
			}
		});
		btnNewButton_1.setFont(new Font("조선로고체", Font.PLAIN, 20));
		btnNewButton_1.setBounds(164, 20, 174, 48);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1 빼기");
		btnNewButton_2.setForeground(new Color(255, 98, 203));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count -= 1;
				number.setText(count+"");
			}
		});
		btnNewButton_2.setFont(new Font("조선로고체", Font.PLAIN, 20));
		btnNewButton_2.setBounds(350, 20, 129, 48);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);

	}

}
