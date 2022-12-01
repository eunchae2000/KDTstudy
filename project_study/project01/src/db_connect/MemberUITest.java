package db_connect;

import javax.swing.JOptionPane;

public class MemberUITest {
	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("비밀번호 입력");

		MemberDAO dao = new MemberDAO();
		
		MemberVO bag = new MemberVO();
		bag.setId(id);
		bag.setPw(pw);
		
//		int result = dao.login(bag);
		
		
	}

}
