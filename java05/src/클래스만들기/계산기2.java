package 클래스만들기;

public class 계산기2 {
	public int add(int x, int y) {
		return x + y;
		
	}
	
	public double add(int x, double y) {
		return x + y;
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public String add(String x, int y) {
		return x + y;
	}
	
	public int[] add() {
		int[] num = {1, 2, 3};
		return num;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public void div(int x, int y) {
		System.out.println("한 사람당 " + x/y);
	}

}
