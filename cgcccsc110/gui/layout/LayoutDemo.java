package cgcccsc110.gui.layout;

//********************************************************************
//	LayoutDemo.java       Java Foundations
//
//	Demonstrates The Use Of Flow, Border, Grid, And Box Layouts
//********************************************************************

import javax.swing.*;

public class LayoutDemo {
	
	//-----------------------------------------------------------------
	//  Sets Up A Frame Containing A Tabbed Pane
	//  The Panel On Each Tab Demonstrates A Different Layout Manager
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame layoutFrame = new JFrame("Layout Manager Demo");
		layoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane layoutTabbedPane = new JTabbedPane();
		layoutTabbedPane.addTab("Intro", new IntroPanel());
		layoutTabbedPane.addTab("Flow", new FlowPanel());
		layoutTabbedPane.addTab("Border", new BorderPanel());
		layoutTabbedPane.addTab("Grid", new GridPanel());
		layoutTabbedPane.addTab("Box", new BoxPanel());
		layoutFrame.getContentPane().add(layoutTabbedPane);
		layoutFrame.pack();
		layoutFrame.setVisible(true);
	}
	
}
