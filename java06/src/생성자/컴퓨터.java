package 생성자;

public class 컴퓨터 {
	int price;
	String com;
	int size;
	
	public 컴퓨터(int price, String com, int size) {
		this.price = price;
		this.com = com;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", com=" + com + ", size=" + size + "]";
	}
	
	
}
