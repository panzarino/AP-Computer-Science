/*
 * Zach Panzarino
 * 9/18/15
 * Project 2.1 - displays frames with information to the screen
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class FrameTester {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		JTextField text = new JTextField("Hello, World!");
		text.setBackground(Color.PINK);
		frame.add(text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JFrame f = new JFrame();
		f.setLocation(200,0);
		f.setSize(400,400);
		JTextField t = new JTextField("Hello, Zach!");
		t.setBackground(new Color(152,251,152));
		f.add(t);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

/* Program Output
See Attached Screenshots
*/