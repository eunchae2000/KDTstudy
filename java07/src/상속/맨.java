package 상속;

public class 맨 extends 사람 {
	// 멤버변수 몇개?
	// 2개
	int size;
	// 멤버메서드 몇개?
	// 10개
	public void 달리다() {
		System.out.println("빨리 달리다.");
	}
	
	@Override
	public String toString() {
		return "맨 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}

}
