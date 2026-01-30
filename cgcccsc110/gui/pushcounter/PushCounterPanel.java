package cgcccsc110.gui.pushcounter;

//********************************************************************
//	PushCounterPanel.java       Java Foundations
//
//	Demonstrates A Graphical User Interface And An Event Listener
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PushCounterPanel extends JPanel {
	
	private int pushCount;
	private JButton pushCounterButton;
	private JLabel pushCounterLabel;

	//-----------------------------------------------------------------
	//  Constructor: Sets Up The GUI
	//-----------------------------------------------------------------
	public PushCounterPanel() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(300, 40));
		pushCount = 0;
		pushCounterButton = new JButton("Push Me!");
		pushCounterButton.addActionListener(new PushCounterButtonListener());
		pushCounterLabel = new JLabel("Pushes: " + pushCount);
		add(pushCounterButton);
		add(pushCounterLabel);
	}
	
	//*****************************************************************
	//  Represents A Listener For Button Push (Action) Events
	//*****************************************************************
	private class PushCounterButtonListener implements ActionListener {
		//--------------------------------------------------------------
		//  Updates The Counter And Label When The Button Is Pushed
		//--------------------------------------------------------------
		@Override
		public void actionPerformed(ActionEvent pushCounterEvent) {
			pushCount++;
			pushCounterLabel.setText("Pushes: " + pushCount);
		}
	}
	
}
