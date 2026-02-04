package cgcccsc110.gui.layout;

//********************************************************************
//	BorderPanel.java       Java Foundations
//
//	Represents The Panel In The LayoutDemo Program That Demonstrates The Border Layout Manager
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class BorderPanel extends JPanel {
	
	//-----------------------------------------------------------------
	//  Sets Up This Panel With A Button In Each Area Of A Border Layout To Show How It Affects Their Position, Shape, And Size
	//-----------------------------------------------------------------
	public BorderPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.GREEN);
		JButton borderButton1 = new JButton("BUTTON 1");
		JButton borderButton2 = new JButton("BUTTON 2");
		JButton borderButton3 = new JButton("BUTTON 3");
		JButton borderButton4 = new JButton("BUTTON 4");
		JButton borderButton5 = new JButton("BUTTON 5");
		add(borderButton1, BorderLayout.CENTER);
		add(borderButton2, BorderLayout.NORTH);
		add(borderButton3, BorderLayout.SOUTH);
		add(borderButton4, BorderLayout.EAST);
		add(borderButton5, BorderLayout.WEST);
	}
	
}
