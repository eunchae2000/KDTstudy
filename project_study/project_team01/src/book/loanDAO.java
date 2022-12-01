package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import book.loanVO;

public class loanDAO {
//	public loanVO insert(int book_id, String member_id) {
//		loanVO bag = null;  /// 쓰레기 값!!
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
//			System.out.println("1. 드라이버 설정 성공..");
//			
//			// 2. db 연결 mySQL: school
//			String url = "jdbc:mysql://localhost:3306/sys?useUnicode=true&serverTimezone=Asia/Seoul";
//			String user = "scott";
//			String password = "tiger";
//			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("2. db연결 성공.");
//
//			// 3. SQL 문을 만든다.
//			String sql = "insert into loan(book_id, member_id) values (?, ?)";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, book_id);
//			ps.setString(2, member_id);
//			
//	
//			System.out.println("3. sql문 객체 생성 성공.");
//
//			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
//			ResultSet rs = ps.executeQuery();
//			System.out.println("통과1");
//			
//			if (rs.next()) {
//				System.out.println("검색결과가 있음.");
//				int book_id1 = rs.getInt(1);
//				String member_id1 = rs.getString(2);
//				System.out.println("검색한 결과>> " + " "  + book_id1 + " " + member_id);
//				
//				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
//				// 4개의 데이터를 UI에게 return!! 해주
//				// 1) 가방을 만들어서,
//				bag = new loanVO();
//				
//				// 2) 데이터를 넣고,
//				bag.setBook_id(book_id1);
//				bag.setMember_id(member_id1);
//				
//			}
//			
//			ps.close();
//			con.close();
//			rs.close();
//			
////			System.out.println("4. sql문 전송 성공, 결과>> " + rs.next());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		// 메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
//		return bag;
//	}

	public void insert(int book_id, String member_id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공..");

			// 2. db 연결 mySQL: school
			String url = "jdbc:mysql://localhost:3306/sys?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			// 3. SQL 문을 만든다.
			String sql = "insert into loan(book_id, member_id) values (?, ?)";
			String sql1 = "update book set book_amount=book_amount-1 where book_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps.setInt(1, book_id);
			ps.setString(2, member_id);
			ps1.setInt(1, book_id);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			int result1 = ps1.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result + "," + result1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//	public loanVO select(String member_id) {
//		loanVO bag = null; /// 쓰레기 값!!
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
//			System.out.println("1. 드라이버 설정 성공..");
//
//			// 2. db 연결 mySQL: school
//			String url = "jdbc:mysql://localhost:3306/sys?useUnicode=true&serverTimezone=Asia/Seoul";
//			String user = "scott";
//			String password = "tiger";
//			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("2. db연결 성공.");
//
//			// 3. SQL 문을 만든다.
//			String sql = "select * from loan where member_id='abc'";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, member_id);
//
//			System.out.println("3. sql문 객체 생성 성공.");
//
//			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
//			ResultSet rs = ps.executeQuery();
//			System.out.println("통과1");
//
//			if (rs.next()) {
//				System.out.println("검색결과가 있음.");
//				String member_id1 = rs.getString(1);
//				System.out.println("검색한 결과>> " + " " + member_id);
//
//				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
//				// 4개의 데이터를 UI에게 return!! 해주
//				// 1) 가방을 만들어서,
//				bag = new loanVO();
//
//				// 2) 데이터를 넣고,
//				bag.setMember_id(member_id1);
//
//			}
//
//			ps.close();
//			con.close();
//			rs.close();
//
////		System.out.println("4. sql문 전송 성공, 결과>> " + rs.next());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		// 메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
//		return bag;
//	}

	public ArrayList<loanVO> list() {
		ArrayList<loanVO> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공..");

			// 2. db 연결 mySQL: school
			String url = "jdbc:mysql://localhost:3306/sys?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			// 3. SQL 문을 만든다.
			String sql = "select * from loan where member_id='abc'";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // 결과값이 true이면!!
				Date rental = rs.getDate(2);
				Date return1 = rs.getDate(3);				
				int day = rs.getInt(4);
				int bm = rs.getInt(5);
				int bookId = rs.getInt(6);
				String memberId = rs.getString(7);
				System.out.println("검색한 결과>>" + rental + " " + bm + " " + bookId + " " + memberId);
				loanVO bag = null; // 쓰레기값!!--> 변수 초기화시켜주어야함.!
				bag = new loanVO();
				bag.setLoan_rental(rental);
				bag.setLoan_return(return1);
				bag.setLoan_day(day);
				bag.setLoan_bm(bm);
				bag.setBook_id(bookId);
				bag.setMember_id(memberId);
				list.add(bag);
				System.out.println("리스트에 들어간 가방수 >> " + list.size());
			}
			// db처리와 관련된 메모리 할당된 것 해제시켜주자.

			ps.close();
			con.close();
			rs.close();

//	System.out.println("4. sql문 전송 성공, 결과>> " + rs.next());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
