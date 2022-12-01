package 추상클래스인터페이스;

public class BananaComputer implements Computer {
	
	@Override
	public void 게임을하다() {
		System.out.println("컴퓨터로 레전드오브리그 게임을 한다.");
	}
	
	@Override
	public void 뉴스를보다() {
		System.out.println("컴퓨터로 실시간 뉴스 기사를 본다.");
	}
	
	@Override
	public void 코딩을하다() {
		System.out.println("컴퓨터로 파이썬 프로그램을 코딩 한다.");	
	}

	
}
