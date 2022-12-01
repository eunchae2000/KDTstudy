package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db_connect.boardVO;

public class BoardDAO {
	public boardVO select(int no) {
		boardVO bag = null;
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
			String sql = "select * from bbs where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				int no1 = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println("검색한 결과>> " + no1 + " " + title + " " + content + " " + writer);

				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return!! 해주
				// 1) 가방을 만들어서,
				bag = new boardVO();

				// 2) 데이터를 넣고,
				bag.setNo(no1);
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

	public void insert(int no, String title, String content, String writer) {

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
			String sql = "insert into bbs(no, title, content, writer) values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete(int no) {

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
			String sql = "delete from bbs where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(int no, String title, String content, String writer) {

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
			String sql = "update bbs set title=?, content=?, writer=? where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			ps.setInt(4, no);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<boardVO> list() {
		ArrayList<boardVO> list = new ArrayList<>();
		boardVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
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

				bag = new boardVO();

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
