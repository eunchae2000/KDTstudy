package 생성자;

public class MaskUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체생성후, 멤버변수 값을 나중에 넣어도 되는 경우
//		Mask m = new Mask();
//		m.color = "흰색";
//		m.count = 1;
//		m.price = 1000;
		
		Mask m1 = new Mask("검정색", 2500, 2);
		System.out.println(m1.color);
		System.out.println(m1.price);
		System.out.println(m1.count);
		
		System.out.println(m1);
	}

}
