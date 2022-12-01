package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import book.bookVO;

public class bookDAO {
	
	public bookVO select(int book_id) {
		System.out.println(book_id);
		bookVO bag = null;  /// 쓰레기 값!!
		
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
			String sql = "select * from book where book_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, book_id);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String genre = rs.getString(3);
				String publisher = rs.getString(4);
				String author = rs.getString(5);
				int amount = rs.getInt(6);
				System.out.println("검색한 결과>> " + id + " " + name + " " + genre + " " + publisher+ " " + author + " " + amount);
				
				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return!! 해주
				// 1) 가방을 만들어서,
				bag = new bookVO();
				
				// 2) 데이터를 넣고,
				bag.setBook_id(id);
				bag.setBook_name(name);
				bag.setBook_genre(genre);
				bag.setBook_publisher(publisher);
				bag.setBook_author(author);
				bag.setBook_amount(amount);
				
			}
			
			ps.close();
			con.close();
			rs.close();
			
//			System.out.println("4. sql문 전송 성공, 결과>> " + rs.next());

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
		return bag;
	}
	
	public ArrayList<bookVO> list() {
		ArrayList<bookVO> list = new ArrayList<>();
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
			String sql = "select * from book";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // 결과값이 true이면!!
				String name = rs.getString(2);
				String genre = rs.getString(3);	
				String publisher = rs.getString(4);
				String author = rs.getString(5);
				int amount = rs.getInt(6);
				System.out.println("검색한 결과>>" + name + " " + genre + " " + publisher + " " + amount);
				bookVO bag = null; // 쓰레기값!!--> 변수 초기화시켜주어야함.!
				bag = new bookVO();
				bag.setBook_name(name);
				bag.setBook_genre(genre);
				bag.setBook_publisher(publisher);
				bag.setBook_author(author);
				bag.setBook_amount(amount);
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

