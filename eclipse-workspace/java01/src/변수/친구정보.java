package 변수;

import javax.swing.JOptionPane;

public class 친구정보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String add = "북구";
		int age = 23;
		char gender = '여';
		String name = "이선주";
		String tel = "01090442332";
		String sn = "001104-1213456";
		String data = JOptionPane.showInputDialog("이름을 입력해주세요");
		System.out.println("당신이 입력한 이름은 " + data+ "님 입니다.");
		
		System.out.println("당신의 친구 이름은 " + name+ "님 입니다.");
		System.out.println("당신의 친구 주소는 " + add+ "님 입니다.");
		System.out.println("당신의 친구 나이는 " + age+ "님 입니다.");
		System.out.println("당신의 친구 성별 " + gender+ "님 입니다.");
		System.out.println("당신의 친구 번호는 " + tel+ "님 입니다.");
		System.out.println("당신의 친구 주민번호는 " + sn+ "님 입니다.");
	}

}
