package 상속;

public class 직원_매니저 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		직원 member = new 직원();
		member.name = "이은채";
		member.adress = "부산";
		member.salary = 200;
		member.rrn = 12345;
		System.out.println(member);
		
		매니저 member2 = new 매니저();
		member2.name = "홍길동";
		member2.adress = "서울";
		member2.salary = 100;
		member2.rrn = 123045;
		member2.bonus = 30;
		System.out.println(member2);

	}

}
