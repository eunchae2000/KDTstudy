package 클래스만들기;

public class 전화기 {
	// 공통적인 성질: 사이즈, 스피커
	// ==> 변수를 사용, 2개의 변수 필요
	// ==> 멤버변수
	// 		자동초기화시켜줌.
	public int size = 11;   // 0으로 자동 초기화
	public String speaker;
	   
	//동작(기능)을 정의 : 통화하다, 사진을 찍다
	public void 통화하다() {
		// 처리내용을 순서대로,,,
		System.out.println("전화기로 통화하다.");
		
	}
	public void 사진을찍다() {
		System.out.println("전화기로 셀카를 찍다.");
	      
	}
	public void 카톡을하다() {
		System.out.println("카톡을 통해 보이스톡을 하다.");
	      
	}


}
