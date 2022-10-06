package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		sMan.날아다니다(); // 수퍼맨
		sMan.달리다(); // 맨
		sMan.먹다(); // 사람 
		sMan.잠자다(); // 사람
		
		원더우먼 ww = new 원더우먼();
		ww.gender = "여자";
		ww.name = "다이애나";
		ww.power = 100;
		System.out.println(ww);
		ww.힘이세진다(); // 수퍼맨
		ww.초인적인힘(); // 맨
		ww.먹다(); // 사람 
		ww.잠자다(); // 사람
	}

}
