package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	public ProductVO one(String id) {
		System.out.println(id);
		ProductVO bag = null;  /// 쓰레기 값!!
		
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
			String sql = "select * from product where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				String id2 = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				int price = rs.getInt(4);
				String company = rs.getString(5);
				String img = rs.getString(6);
				
				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return!! 해주
				// 1) 가방을 만들어서,
				bag = new ProductVO();
				
				// 2) 데이터를 넣고,
				bag.setID(id2);
				bag.setNAME(name);
				bag.setCONTENT(content);
				bag.setPRICE(price);
				bag.setCOMAPNY(company);
				bag.setIMG(img);
				
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
	
	public void insert(ProductVO bag)  {		// String id

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
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getID());
			ps.setString(2, bag.getNAME());
			ps.setString(3, bag.getCONTENT());
			ps.setInt(4, bag.getPRICE());
			ps.setString(5, bag.getCOMAPNY());
			ps.setString(6, bag.getIMG());

			System.out.println("3. sql문 객체 생성 성공.@@@@@");

			String result2 = "실패";
			try {
				// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
				int result = ps.executeUpdate();
				System.out.println("4. sql문 전송 성공, 결과>> " + result);
				if(result == 1) {
					result2 = "성공";
				}
			}catch(Exception e) {
					System.out.println("상품등록시 에러발생");
					e.printStackTrace();
				}
				ps.close();
				con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delete(String id) {

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
			String sql = "delete from product where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void update(ProductVO bag) {
		
		// 자바에서 DBMS를 연결
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
			String sql = "update product set content=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getCONTENT());
			ps.setString(2, bag.getID());

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌 nzx7
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공, 결과>> " + result);
			
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ProductVO login(ProductVO bag) {
		System.out.println(bag);
//		ProductVO bag = null;  /// 쓰레기 값!!
		
		int result = 0;  // 0인 경우 실패
		
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
			String sql = "select * from member where id=? and where pw=?";
			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, bag.getId());
//			ps.setString(2, bag.getPw());

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				String id2 = rs.getString(1);
				String pw = rs.getString("pw");
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println("검색한 결과>> " + id2 + " " + pw + " " + name + " " + tel);
				
				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return!! 해주
				// 1) 가방을 만들어서,
				bag = new ProductVO();
				
				// 2) 데이터를 넣고,
//				bag.setId(id2);
//				bag.setPw(pw);
//				bag.setName(name);
//				bag.setTel(tel);
				
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
	
	public ArrayList<ProductVO> list() {
		ArrayList<ProductVO> list = new ArrayList<>();
		ProductVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();

			System.out.println(rs);
			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				int price = rs.getInt(4);
				String company = rs.getString(5);
				String img = rs.getString(6);
				System.out.println("데이터 >> " + id + " " + name + " " + content + " " + price + " " + company + " " + img );

				bag = new ProductVO();

				bag.setID(id);
				bag.setNAME(name);
				bag.setCONTENT(content);
				bag.setPRICE(price);
				bag.setCOMAPNY(company);
				bag.setIMG(img);

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
