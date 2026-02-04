package cgcccsc110.gui.styleoptions;

//********************************************************************
//	StyleOptions.java       Java Foundations
//
//	Demonstrates The Use Of Check Boxes
//********************************************************************

import javax.swing.JFrame;

public class StyleOptions {
	
	//-----------------------------------------------------------------
	//  Creates And Displays The Style Options Frame
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame styleOptionsFrame = new JFrame("Style Options");
		styleOptionsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		styleOptionsFrame.getContentPane().add(new StyleOptionsPanel());
		styleOptionsFrame.pack();
		styleOptionsFrame.setVisible(true);
	}
	
}
