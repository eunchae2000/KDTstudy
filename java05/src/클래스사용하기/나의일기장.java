package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의일기장 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 141, 0));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/coco/Downloads/7kjddb1f4fe70.jpeg"));
		lblNewLabel.setBounds(45, 14, 407, 173);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디: ");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(118, 226, 77, 25);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호: ");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(118, 281, 90, 25);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(142, 221, 255));
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t1.setBounds(207, 219, 164, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(142, 221, 255));
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(207, 273, 164, 42);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				// id = "root", pw = "1234"이면, 일기쓰는 화면을 띄우고
				// 아니면 JOptionPane으로 "입력값이 달라서 로그인 실패 입니다."
				// 일기 쓰기 화면창을 띄워라!
				if (s1.equals("root") && s2.equals("1234")) {
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				}else {
					JOptionPane.showConfirmDialog(f, "입력값이 달라서 로그인 실패입니다.");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("/Users/coco/Downloads/로그인.png"));
		btnNewButton.setBounds(273, 359, 150, 64);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("/Users/coco/Downloads/리셋버튼.png"));
		btnNewButton_1.setBounds(73, 359, 150, 64);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}
