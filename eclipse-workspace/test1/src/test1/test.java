package test1;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class test {
	private static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();

		// 2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);

		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);

		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("빨간자동차");
		btnNewButton.setIcon(
				new ImageIcon("/Users/coco/Desktop/KDT 백엔드/workspace/eclipse-workspace/test1/src/test1/red.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);

		// 3.
		f.setVisible(true);

	}

}
