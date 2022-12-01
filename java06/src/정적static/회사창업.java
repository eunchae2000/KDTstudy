package 정적static;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "남");
		직원 work3 = new 직원("송길동", 26, "여");

		System.out.println("1) 우리 회사 직원수는? " + 직원.count);
		System.out.println("2) 우리 회사 직원정보는? ");
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("3) 우리 회사의 직원의 평균 나이는? " + 직원.avgAge() + "살");
	}

}
