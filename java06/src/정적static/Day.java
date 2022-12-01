package 정적static;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int total;
	
	// 객체생성시, 3개 데이터 반드시 넣어서 객체생성하세요!!!
	public Day(String doing, int time, String location) {
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
		total += time;
	}
	
	public double getAvg() {
		return total / (double)count;
		
	}
	
	// 객체생성후, 생성된 객체의 주소가 아니라,
	// 			그 주소가 가르키는 인스턴스 변수의 값들을 가지고 String을 만들어주세요!
	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}

}

	
