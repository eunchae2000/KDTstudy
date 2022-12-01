package test1;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

public class cac {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(240, 239, 238));
		f.setSize(400, 400);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 400, 174);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().setLayout(null);
		btnNewButton.setIcon(new ImageIcon("/Users/coco/Downloads/7kjddb1f4fe70.jpeg"));
		f.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setBackground(new Color(0, 24, 239));
		lblNewLabel.setForeground(new Color(0, 12, 229));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(46, 186, 61, 39);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBackground(new Color(244, 223, 0));
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t1.setBounds(143, 186, 203, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		t2.setColumns(10);
		t2.setBackground(new Color(244, 223, 0));
		t2.setBounds(143, 237, 203, 37);
		f.getContentPane().add(t2);

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			// 버튼을 클릭했을 때 actionPerformed() 함수가 사용하도록 규칙이 설정되어 있음.
			public void actionPerformed(ActionEvent e) {
				// plus 버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				// 1. 두 수를 가지고 오세요.
				String n1 = t1.getText();
				String n2 = t2.getText();
				// 2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 + n22);
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.red);
				t2.setBackground(Color.blue);
//				f.setTitle("더한 결과는 " + (n11+n22));
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1.setBounds(20, 288, 67, 60);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(new Color(0, 12, 229));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1.setBackground(new Color(0, 24, 239));
		lblNewLabel_1.setBounds(46, 237, 61, 39);
		f.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton_1_1 = new JButton("-");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				String n1 = t1.getText();
				String n2 = t2.getText();
				// 2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 - n22);
			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1_1.setBounds(119, 288, 67, 60);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("/");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요.");
				String n1 = t1.getText();
				String n2 = t2.getText();
				// 2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 / n22);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1_1_1.setBounds(213, 288, 67, 60);
		f.getContentPane().add(btnNewButton_1_1_1);

		JButton btnNewButton_1_1_1_1 = new JButton("*");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");
				String n1 = t1.getText();
				String n2 = t2.getText();
				// 2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 * n22);
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1_1_1_1.setBounds(311, 288, 67, 60);
		f.getContentPane().add(btnNewButton_1_1_1_1);
		f.setVisible(true);

	}

}
