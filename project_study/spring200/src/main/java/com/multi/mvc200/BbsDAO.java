package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BbsDAO {
	
	public void insert(BbsDTO bag)  {		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "insert into bbs(no, title, content, writer) values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getNo());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());

			System.out.println("3. sql문 객체 생성 성공.");

			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public int delete(int no) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "delete from bbs where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);

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
	
	public BbsDTO one(int no) {
		System.out.println(no);
		BbsDTO bag = null;  /// 쓰레기 값!!
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");
			
			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from bbs where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				int id2 = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println("검색한 결과>> " + id2 + " " + title + " " + content + " " + writer);
				
				bag = new BbsDTO();
				
				bag.setNo(id2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	public void update(int no, String title, String content, String writer) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "update bbs set title=?, content=?, writer=? where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);

			System.out.println("3. sql문 객체 생성 성공.");

			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<BbsDTO> list() {
		ArrayList<BbsDTO> list = new ArrayList<>();
		BbsDTO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();

			System.out.println(rs);
			while (rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println("데이터 >> " + no + " " + title + " " + content + " " + writer);

				bag = new BbsDTO();

				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				list.add(bag);
				System.out.println("4. sql문 전송 성공, 결과>> " + list.size());
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
