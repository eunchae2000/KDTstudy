package 형변환;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 신호등 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(618, 692);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("빨강신호");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("조선견고딕", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("빨간신호.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("노랑신호");
		btnNewButton_1.setBackground(new Color(255, 229, 0));
		btnNewButton_1.setFont(new Font("조선견고딕", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("노랑신호.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton btnNewButton_2 = new JButton("파랑신호");
		btnNewButton_2.setBackground(new Color(0, 25, 255));
		btnNewButton_2.setFont(new Font("조선견고딕", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("초록신호.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		f.setVisible(true);
		
	}

}
