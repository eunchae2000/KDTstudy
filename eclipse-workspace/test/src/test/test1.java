package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 610);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("K-pop 인기 투표");
		lblNewLabel.setBounds(90, 18, 227, 31);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("/Users/coco/Downloads/프로미스나인.jpeg"));
		btnNewButton_1.setBounds(32, 241, 150, 150);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("/Users/coco/Downloads/스테이씨.jpeg"));
		btnNewButton_2.setBounds(32, 403, 150, 150);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("3. 스테이씨 - ASAP");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(194, 412, 200, 30);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1. 아이유-라일락");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(194, 92, 200, 30);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("2. 프로미스나인 - we go");
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(194, 252, 200, 31);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("/Users/coco/Downloads/아이유.jpeg"));
		btnNewButton.setBounds(32, 79, 150, 150);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);

	}
}
