package cgcccsc110.gui.layout;

//********************************************************************
//	FlowPanel.java       Java Foundations
//
//	Represents The Panel In The LayoutDemo Program That Demonstrates The Flow Layout Manager
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class FlowPanel extends JPanel {
	
	//-----------------------------------------------------------------
	//  Sets Up This Panel With Some Buttons To Show How Flow Layout Affects Their Position
	//-----------------------------------------------------------------
	public FlowPanel() {
		setLayout(new FlowLayout());
		setBackground(Color.GREEN);
		JButton flowButton1 = new JButton("BUTTON 1");
		JButton flowButton2 = new JButton("BUTTON 2");
		JButton flowButton3 = new JButton("BUTTON 3");
		JButton flowButton4 = new JButton("BUTTON 4");
		JButton flowButton5 = new JButton("BUTTON 5");
		add(flowButton1);
		add(flowButton2);
		add(flowButton3);
		add(flowButton4);
		add(flowButton5);
	}
	
}
