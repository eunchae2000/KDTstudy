package 컬렉션;

import java.util.HashSet;
import java.util.LinkedList;

public class 팀구성 {

	public static void main(String[] args) {
		// 1. set -> HashSet
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("DB관리자");
		
		System.out.println(team);
		System.out.println(team.size());

	}

}
