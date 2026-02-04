package cgcccsc110.gui.layout;

//********************************************************************
//	IntroPanel.java       Java Foundations
//
//	Represents The Introduction Panel For The LayoutDemo Program
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel {
	
	//-----------------------------------------------------------------
	//  Sets Up This Panel With Two Labels
	//-----------------------------------------------------------------
	public IntroPanel() {
		setBackground(Color.GREEN);
		JLabel introLabel1 = new JLabel("Layout Manager Demonstration:");
		JLabel introLabel2 = new JLabel("Choose A Tab To See An Example Of A Layout Manager");
		add(introLabel1);
		add(introLabel2);
	}
	
}
