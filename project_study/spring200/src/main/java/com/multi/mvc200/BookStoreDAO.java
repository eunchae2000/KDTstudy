package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookStoreDAO {
	public void insert(BookStoreDTO bag)  {		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "insert into bookstore(id, title, writer, publish) values (null, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getWriter());
			ps.setString(3, bag.getPublish());

			System.out.println("3. sql문 객체 생성 성공.");

			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void delete(int id) {

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
			String sql = "delete from bookstore where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void update(int id, String title, String writer, String publish) {

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
			String sql = "update bookstore set title=?, writer=?, publish=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);			
			ps.setString(2, writer);
			ps.setString(3, publish);
			ps.setInt(4, id);
			
			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public BookStoreDTO one(BookStoreDTO bookStoreDTO) {
		BookStoreDTO bookStoreDTO2 = null;  /// 쓰레기 값!!
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");
			
			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from bookstore where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bookStoreDTO.getId());

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				bookStoreDTO2 = new BookStoreDTO();
				bookStoreDTO2.setId(rs.getInt(1));
				bookStoreDTO2.setTitle(rs.getString(2));
				bookStoreDTO2.setWriter(rs.getString(3));
				bookStoreDTO2.setPublish(rs.getString(4));
				
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookStoreDTO2;
	}
	
	public ArrayList<BookStoreDTO> list(){
		ArrayList<BookStoreDTO> list = new ArrayList<BookStoreDTO>();
		BookStoreDTO bookStoreDTO2 = null; 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");
			
			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from bookstore";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("검색결과가 있음.");
				bookStoreDTO2 = new BookStoreDTO();
				bookStoreDTO2.setId(rs.getInt(1));
				bookStoreDTO2.setTitle(rs.getString(2));
				bookStoreDTO2.setWriter(rs.getString(3));
				bookStoreDTO2.setPublish(rs.getString(4));
				
				list.add(bookStoreDTO2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
