package test1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(246, 253, 65));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("이름 ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(41, 57, 61, 16);
		f.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setBounds(127, 135, 130, 26);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("주소");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(26, 246, 101, 16);
		f.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(127, 55, 130, 26);
		f.getContentPane().add(textField_1);

		JLabel lblNewLabel_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(26, 143, 101, 16);
		f.getContentPane().add(lblNewLabel_1_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(127, 244, 130, 26);
		f.getContentPane().add(textField_2);

		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(46, 368, 117, 29);
		f.getContentPane().add(btnNewButton);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(276, 368, 130, 26);
		f.getContentPane().add(textField_3);
		f.setVisible(true);

	}
}
