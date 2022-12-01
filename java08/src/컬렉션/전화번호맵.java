package 컬렉션;

import java.util.HashMap;

public class 전화번호맵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "동생");
		phone.put(4, "친구");
		
		System.out.println(phone);
		System.out.println(phone.get(1));
		
		phone.put(1, "직장동료");
		System.out.println(phone);

	}

}
