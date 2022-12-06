package FrameTest;

import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		Frame f = new Frame("Frame Demo");
		f.setSize(300, 200);
		f.setVisible(true);		// 무조건 .setVisible(true); 지정해줘야 창이 뜸
	}

}
