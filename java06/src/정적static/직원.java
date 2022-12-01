package 정적static;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int total_gender;

	public 직원(String name, int age, String gender) {
		count++;
		total_gender += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static double avgAge() {
		return total_gender / (double) count;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
