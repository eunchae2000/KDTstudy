package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	public MemberDTO one(String id) {
		System.out.println(id);
		MemberDTO bag = null;  /// 쓰레기 값!!
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");
			
			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from member where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				String id2 = rs.getString(1);
				String pw = rs.getString("pw");
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println("검색한 결과>> " + id2 + " " + pw + " " + name + " " + tel);
				
				bag = new MemberDTO();
				
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	public void insert(MemberDTO bag)  {		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "insert into member(id, pw, name, tel) values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			System.out.println("3. sql문 객체 생성 성공.");

			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int delete(String id) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "delete from member where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

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
	
	public void update(String id, String pw, String name, String tel) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "delete from member where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. sql문 객체 생성 성공.");

			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int login(MemberDTO bag) {
		System.out.println(bag);
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");
			
			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from member where id=? and pw=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				result = 1;
			}
			
			ps.close();
			con.close();
			rs.close();
			
			System.out.println("4. sql문 전송 성공, 결과>> " + rs.next());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<MemberDTO> list() {
		ArrayList<MemberDTO> list = new ArrayList<>();
		MemberDTO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();

			System.out.println(rs);
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println("데이터 >> " + id + " " + pw + " " + name + " " + tel);

				bag = new MemberDTO();

				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);

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
