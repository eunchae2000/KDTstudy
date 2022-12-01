package test1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class work {
	private static JTextField food;
	private static JTextField age;
	private static JTextField ko;
	private static JTextField math;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(225, 198, 203));
		f.setSize(403, 489);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(17, 18, 157, 31);
		f.getContentPane().add(lblNewLabel);

		food = new JTextField();
		food.setBackground(new Color(251, 221, 0));
		food.setBounds(181, 18, 194, 33);
		f.getContentPane().add(food);
		food.setColumns(10);

		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.setBackground(new Color(138, 228, 207));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String food1 = food.getText();
				if (food1.equals("아메리카노") || food1.equals(" 아이스 아메리카노") || food1.equals("라떼")) {
					JOptionPane.showMessageDialog(f, "카페 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요.");
				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton.setBounds(17, 69, 358, 40);
		f.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(17, 152, 157, 31);
		f.getContentPane().add(lblNewLabel_1);

		age = new JTextField();
		age.setBackground(new Color(0, 133, 246));
		age.setColumns(10);
		age.setBounds(181, 152, 194, 33);
		f.getContentPane().add(age);

		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age1 = age.getText();
				int age11 = Integer.parseInt(age1);
				JOptionPane.showMessageDialog(f, (age11 + 1));
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1.setBounds(17, 203, 358, 40);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(17, 282, 157, 31);
		f.getContentPane().add(lblNewLabel_1_1);

		ko = new JTextField();
		ko.setBackground(new Color(138, 228, 207));
		ko.setColumns(10);
		ko.setBounds(181, 282, 194, 33);
		f.getContentPane().add(ko);

		JLabel lblNewLabel_1_2 = new JLabel("수학 점수");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(17, 337, 157, 31);
		f.getContentPane().add(lblNewLabel_1_2);

		math = new JTextField();
		math.setBackground(new Color(138, 228, 207));
		math.setColumns(10);
		math.setBounds(181, 337, 194, 33);
		f.getContentPane().add(math);

		JButton btnNewButton_1_1 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ko1 = ko.getText();
				String math1 = math.getText();

				int ko11 = Integer.parseInt(ko1);
				int math11 = Integer.parseInt(math1);
				
				double result = (ko11+math11)/2.0;

				JOptionPane.showMessageDialog(f, result);
			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1_1.setBounds(17, 384, 358, 40);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}

}
