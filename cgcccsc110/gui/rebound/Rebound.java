package cgcccsc110.gui.rebound;

//********************************************************************
//	Rebound.java       Java Foundations
//
//	Demonstrates An Animation And The Use Of The Timer Class
//********************************************************************

import javax.swing.JFrame;

public class Rebound {
	
	//-----------------------------------------------------------------
	//  Displays The Main Frame Of The Program
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame reboundFrame = new JFrame("Rebound");
		reboundFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reboundFrame.getContentPane().add(new ReboundPanel());
		reboundFrame.pack();
		reboundFrame.setVisible(true);
	}
	
}
