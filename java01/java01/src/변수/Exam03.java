package 변수;

import javax.swing.JOptionPane;

public class Exam03 {
	public static void main(String[] args) {
		// 입력
		String telecom = JOptionPane.showInputDialog("통신사 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		String user = JOptionPane.showInputDialog("가입자이름 입력");
		
		// 처리, +결합연산자인 경우는 하나라도 String, 결과도 String
		String result = user + "님은 " + telecom + "에 " + tel;
		
		// 출력
		JOptionPane.showMessageDialog(null,"다이얼로그로 " + result + "로 가입되셨니다.");
	}

}
