package myFrame;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MYFRAME");
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}

}
