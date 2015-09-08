/*
 * Zach Panzarino
 * 9/2/15
 * Project 1.1 - prints user inputted name in pane
 */

import javax.swing.JOptionPane;
public class DialogViewer {
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showInputDialog("What would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, "+name+". I'm afraid I can't do that.");
		System.exit(0);
	}
}

/* Program Output
See Attached Screenshot
*/