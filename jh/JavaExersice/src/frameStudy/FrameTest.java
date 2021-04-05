package frameStudy;

import javax.swing.JFrame;
//스윙클래스 선언

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		//객체 생성
		
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//사용자가 프레임의 오른쪽 상단에 있는 close 버튼을 누르면 전체 프로그램을 종료하도록 설정
		f.setVisible(true);

	}

}
