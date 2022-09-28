package 조건문;

public class SwitchCase테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수(long X), 문자1(char), 문자열(String)
		String name = "자바";
		
		// 자체 break 기능이 없어서, 프로그래머가
		// break을 써주어야 한다.
		switch (name) {
		case "자바":
			System.out.println("1103호로!");
			break;
		case "파이썬":
			System.out.println("1104호로!");
			break;
		case "리눅스":
			System.out.println("1102호로!");
			break;
		case "C++":
			System.out.println("1105호로!");
			break;
		default: //else와 동일!, 생략가
			System.out.println("카운터로 가세요.");
			break;
		}
	}

}
