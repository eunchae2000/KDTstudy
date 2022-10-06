package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	// 멤버변수
	private static JTextField t1;
	private static JTextField t2;

	// 멤버메서드
	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 200, 129));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("EF_다이어리", Font.PLAIN, 22));
		lblNewLabel.setBounds(57, 41, 125, 31);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("EF_다이어리", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(57, 100, 125, 31);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용 ");
		lblNewLabel_2.setFont(new Font("EF_다이어리", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(57, 165, 135, 31);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("EF_다이어리", Font.PLAIN, 20));
		t1.setBounds(204, 29, 231, 54);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextArea t3 = new JTextArea();
		t3.setFont(new Font("EF_다이어리", Font.PLAIN, 20));
		t3.setBounds(204, 165, 231, 183);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				// 자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는
				// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				// 반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
				// try~catch
				
				try {
					// file.txt와 자바프로그램 간 스트림(강물, 연결통로)를 만들어라!
					FileWriter file = new FileWriter(s1+".txt");
					// 스트림을 통해서 데이터를 보내라.
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					// 스트림이 닫힐 때 데이터를 다 보냈다고 인식함.
					file.close();			
				}catch(Exception e2) {
					System.out.println("파일에 저장 중 에러발생함.!!!");
				}
			}
		});
		btnNewButton.setBackground(new Color(129, 255, 235));
		btnNewButton.setFont(new Font("EF_다이어리", Font.PLAIN, 30));
		btnNewButton.setBounds(86, 374, 312, 59);
		f.getContentPane().add(btnNewButton);
		
		t2 = new JTextField();
		t2.setFont(new Font("EF_다이어리", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(204, 88, 231, 54);
		f.getContentPane().add(t2);
		f.setVisible(true);

	}
}
