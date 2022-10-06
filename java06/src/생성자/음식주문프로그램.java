package 생성자;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	static int count; // int count = 0; 와 동일, 전역변수는 자동 초기화 
	static final int PRICE = 5000; // 상수는 final을 붙여서 변경 불가능으로 설정
	
	private static JTextField t1;
	static JLabel result;
	static int 짬뽕count = 0;
	static int 우동count = 0;
	static int 짜장count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("나의 음식 주문 프로그램");
		f.getContentPane().setBackground(new Color(179, 233, 255));
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수:");
		lblNewLabel.setFont(new Font("조선견고딕", Font.PLAIN, 23));
		lblNewLabel.setBounds(504, 28, 98, 48);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("조선견고딕", Font.PLAIN, 25));
		t1.setBackground(new Color(255, 225, 0));
		t1.setBounds(560, 28, 183, 48);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(new Color(255, 7, 0));
		result.setFont(new Font("조선견고딕", Font.PLAIN, 30));
		result.setBounds(56, 406, 687, 66);
		f.getContentPane().add(result);
		
		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("/Users/coco/Downloads/짜장.jpeg"));
		center.setBounds(156, 100, 478, 299);
		f.getContentPane().add(center);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 주문량을 현재 카운트에 하나 플러스
				짬뽕count++;
				count++;
				// t1 현재 주문량을 변경
				t1.setText(count + "개");
				// center 라벨에 있는 이미지 변경
				center.setIcon(new ImageIcon("/Users/coco/Downloads/짬뽕.jpeg"));
				// result 라벨에 있는 결제 금액 변경
				result.setText("결제금액: " + count*PRICE + "원");
				f.setTitle("짬뽕개수: " + 짬뽕count + " 우동개수: " + 우동count + " 짜장개수: " + 짜장count);
			}
		});
		btnNewButton.setBackground(new Color(246, 172, 255));
		btnNewButton.setFont(new Font("조선견고딕", Font.PLAIN, 20));
		btnNewButton.setBounds(28, 18, 117, 70);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				우동count++;
				// t1 현재 주문량을 변경
				t1.setText(count + "개");
				// center 라벨에 있는 이미지 변경
				center.setIcon(new ImageIcon("/Users/coco/Downloads/우동.jpeg"));
				// result 라벨에 있는 결제 금액 변경
				result.setText("결제금액: " + count*PRICE + "원");
				f.setTitle("짬뽕개수: " + 짬뽕count + " 우동개수: " + 우동count + " 짜장개수: " + 짜장count);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 217, 159));
		btnNewButton_1.setFont(new Font("조선견고딕", Font.PLAIN, 20));
		btnNewButton_1.setBounds(178, 18, 117, 70);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장면");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짜장count++;
				// t1 현재 주문량을 변경
				t1.setText(count + "개");
				// center 라벨에 있는 이미지 변경
				center.setIcon(new ImageIcon("/Users/coco/Downloads/짜장.jpeg"));
				// result 라벨에 있는 결제 금액 변경
				result.setText("결제금액: " + count*PRICE + "원");
				f.setTitle("짬뽕개수: " + 짬뽕count + " 우동개수: " + 우동count + " 짜장개수: " + 짜장count);
			}
		});
		
		btnNewButton_2.setBackground(new Color(171, 255, 173));
		btnNewButton_2.setFont(new Font("조선견고딕", Font.PLAIN, 20));
		btnNewButton_2.setBounds(331, 18, 117, 70);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
