package 상속;

public class 우먼 extends 사람 {
	
	int power;
	
	public void 힘이세진다() {
		System.out.println("힘이 엄청 세진다.");
	}

	@Override
	public String toString() {
		return "우먼 [power=" + power + ", gender=" + gender + ", name=" + name + "]";
	}

}
