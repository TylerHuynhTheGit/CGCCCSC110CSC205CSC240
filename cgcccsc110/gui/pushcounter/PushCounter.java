package cgcccsc110.gui.pushcounter;

//********************************************************************
//	PushCounter.java       Java Foundations
//
//	Demonstrates A Graphical User Interface And An Event Listener
//********************************************************************

import javax.swing.JFrame;

public class PushCounter {
	
	//-----------------------------------------------------------------
	//  Creates And Displays The Main Program Frame
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame pushCounterFrame = new JFrame("Push Counter");
		pushCounterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pushCounterFrame.getContentPane().add(new PushCounterPanel());
		pushCounterFrame.pack();
		pushCounterFrame.setVisible(true);
	}
	
}
