/*
 * Zach Panzarino
 * 9/2/15
 * Program 1.8 - prints user inputted name in pane
 */

import javax.swing.JOptionPane;
public class DialogViewer {
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, "+name);
		System.exit(0);
	}
}

/* Program Output
See Attached Screenshot

Hello, Zachary
*/