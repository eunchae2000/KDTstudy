package 상속활용;

import javax.swing.JOptionPane;

//           자식클래스 extends 부모클래스
public class 카운터스레드 extends Thread {

	@Override // 표시@ == annotation(어노테이션, 표시)
	public void run() {
		for (int i = 20; i >= 0; i--) {
			System.out.println("카운트 >> " + i);

			// cpu가 한꺼번에 너무 많이 실행해버려서, 다른 스레드랑 동시에 처리되는 것처럼 보이지 않음.
			// cpu 1초씩 쉬었다가 실행시켜줘라고 설정

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 밀리세켠즈 1000 == 1초
				// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할 때는
				// 프로그램이 중단되는 위험한 상황으로 인식되어
				// 그런 상황이 발생했을 때 어떻게 할지를 반드시!! 써주어야함.
				// 예외처리
	        if (i == 0) {
	            JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실부탁드립니다.");
	         }
		}
	}
}