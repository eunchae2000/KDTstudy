package 배열기본;

public class 배열기초확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] trip = new String[5];
		trip[0] = "서울";
		trip[1] = "부산";
		trip[2] = "대구";
		trip[3] = "일본";
		trip[4] = "독일";
		for (int i = 0; i<trip.length; i++) {
			System.out.println(trip[i]);
		}
		
		char[] color = new char[3];
		color[0] = 'G';
		color[1] = 'R';
		color[2] = 'P';
		for (int i = 0; i<color.length; i++) {
			System.out.println(color[i]);
		}
		
		double[] height = new double[4];
		height[0] = 181.9;
		height[1] = 179.5;
		height[2] = 186.2;
		height[3] = 178.3;
		for (int i = 0; i<height.length; i++) {
			System.out.println(height[i]);
		}
	}

}
