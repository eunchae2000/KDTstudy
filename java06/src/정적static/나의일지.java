package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호안에서만 사용 가능
		// day1, day2. day3는 메서드 안에서만 쓸 수 있음
		// main 안에서만 쓸 수 있는 지역변수(local 변수)
		// 지역변수 <---> 전역변수
		// 지역변수는 자동초기화 x
		// 지역변수는 프로그래머가 자동초기화 시켜야 한다.
		
		Day day1 = new Day("자바공부", 10, "강남역");
		System.out.println(day1); 
		System.out.println(day1.count); // 주소대신 toString이 찍힘.
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2); 
		System.out.println(day2.count); // 주소대신 toString이 찍힘.
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3); 
		System.out.println(day3.count); // 주소대신 toString이 찍힘.
		
		System.out.println("전체 하는일의 시간 " + Day.total);
		System.out.println("평균 하는일의 시간 " + Day.total/3);
	}

}
