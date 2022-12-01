package 추상클래스인터페이스;

public class AppleComputer implements Computer {
	@Override
	public void 게임을하다() {
		System.out.println("컴퓨터로 메이플스토리 게임을 한다.");
	}
	
	@Override
	public void 뉴스를보다() {
		System.out.println("컴퓨터로 최신 뉴스 기사를 본다.");
	}
	
	@Override
	public void 코딩을하다() {
		System.out.println("컴퓨터로 자바 프로그램을 코딩 한다.");	
	}
	

}
