package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBConnect_mySQL {

	public static void main(String[] args) throws Exception {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공..");
			
			// 2. db 연결 mySQL: school 
			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");
			
			// 3. SQL 문을 만든다. 
			String sql = "delete from member where id='win'";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 객체 생성 성공.");
			
			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);
			
		}catch(Exception e) { 
			e.printStackTrace();
		}
		
	}

}
