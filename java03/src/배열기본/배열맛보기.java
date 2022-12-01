package 배열기본;

public class 배열맛보기 {

	public static void main(String[] args) {
		// 무더기에 저장될 데이터를 미리 알고 있는 경우
		int[] 정답 = {1, 1, 2, 3};
		// int 데이터가 무더기로 저장된 위치(주소)
		// 정답: 주소가 저장됨.
		// {1, 1, 2, 3}: 무더기 영역에 저장된 정수 데이터들
		System.out.println(정답);
		
		int[] 내답 = {1, 2, 4, 3};
		
		// 무더기에 저장될 데이터를 처음에 모르고 있다가 
		// 나중에 넣을 수도 있음.
		
		int[] 공간들 = new int[1000];
	}

}
