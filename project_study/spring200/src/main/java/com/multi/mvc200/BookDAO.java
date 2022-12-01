package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookDAO {
	public void insert(BookDTO bag) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "insert into book(id, name, img, url) values (null, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getImg());
			ps.setString(3, bag.getUrl());

			System.out.println("3. sql문 객체 생성 성공.");

			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int delete(int id) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "delete from book where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			System.out.println("3. sql문 객체 생성 성공.");

			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public BookDTO one(BookDTO bookDTO) {
		BookDTO bookDTO2 = null; /// 쓰레기 값!!

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from book where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bookDTO.getId());

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				bookDTO2 = new BookDTO();
				bookDTO2.setId(rs.getInt(1));
				bookDTO2.setName(rs.getString(2));
				bookDTO2.setImg(rs.getString(3));
				bookDTO2.setUrl(rs.getString(4));

			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookDTO2;
	}

	public ArrayList<BookDTO> list() {
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		BookDTO bookStoreDTO2 = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from book";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // 결과값이 true이면!!
				BookDTO bag = new BookDTO();
				bag.setId(rs.getInt(1));
				bag.setName(rs.getString(2));
				bag.setUrl(rs.getString(3));
				bag.setImg(rs.getString(4));
				list.add(bag);
			} // while
			System.out.println("box(list)에 들어간 가방의 갯수>> " + list.size());
			// db처리와 관련된 메모리 할당된 것 해제시켜주자.
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
		return list;
	}

}
