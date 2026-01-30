package cgcccsc110.gui.leftright;

//********************************************************************
//	LeftRight.java       Java Foundations
//
//	Demonstrates The Use Of One Listener For Multiple Buttons
//********************************************************************

import javax.swing.JFrame;

public class LeftRight {
	
	//-----------------------------------------------------------------
	//  Creates And Displays The Main Program Frame
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame leftRightFrame = new JFrame("Left Right");
		leftRightFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		leftRightFrame.getContentPane().add(new LeftRightPanel());
		leftRightFrame.pack();
		leftRightFrame.setVisible(true);
	}
	
}
