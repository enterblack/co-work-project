package frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		//버튼의 모습을 확실하게 볼 수 있게 배치관리자를 FlowLayout으로 변경을함 
		//FlowLayout이란 컴포넌트를 물이 흐르듯이 순차적으로 배치하는 방식이다.
		//배치관리자는 setLayout() 메소드를 호출하면된다. 배치관리자 객체는 FlowLayout클래스로 생성한다.
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}

}
