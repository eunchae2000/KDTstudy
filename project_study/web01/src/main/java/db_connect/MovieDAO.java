package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDAO {
	public MovieVO one(String id) {
		System.out.println(id);
		MovieVO bag = null;  /// 쓰레기 값!!
		
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
			String sql = "select * from movie where movie_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. sql문 객체 생성 성공.");

			// 4. SQL 문을 DB 서버에 보낸다. --> 결과가 어떻게 되었는지 자바 프로그램 알려줌.
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				String id2 = rs.getString(1);
				String title = rs.getString(2);
				String genre = rs.getString(3);
				String img = rs.getString(4);
				String url1 = rs.getString(5);
				System.out.println("검색한 결과>> " + id2 + " " + title + " " + genre + " " + img + " " + url1);
				
				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return!! 해주
				// 1) 가방을 만들어서,
				bag = new MovieVO();
				
				// 2) 데이터를 넣고,
				bag.setMovie_id(id2);
				bag.setMovie_title(title);
				bag.setMovie_genre(genre);
				bag.setMovie_img(img);
				bag.setMovie_url(url1);
				
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
	
	public ArrayList<MovieVO> list() {
		ArrayList<MovieVO> list = new ArrayList<>();
		MovieVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공..");

			String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			String sql = "select * from movie";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 객체 생성 성공.");

			ResultSet rs = ps.executeQuery();

			System.out.println(rs);
			while (rs.next()) {
				String id2 = rs.getString(1);
				String title = rs.getString(2);
				String genre = rs.getString(3);
				String img = rs.getString(4);
				String url1 = rs.getString(5);
				System.out.println("검색한 결과>> " + id2 + " " + title + " " + genre + " " + img + " " + url);
				
				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return!! 해주
				// 1) 가방을 만들어서,
				bag = new MovieVO();
				
				// 2) 데이터를 넣고,
				bag.setMovie_id(id2);
				bag.setMovie_title(title);
				bag.setMovie_genre(genre);
				bag.setMovie_img(img);
				bag.setMovie_url(url1);

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
