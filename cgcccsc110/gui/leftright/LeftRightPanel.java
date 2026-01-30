package cgcccsc110.gui.leftright;

//********************************************************************
//	LeftRightPanel.java       Java Foundations
//
//	Demonstrates The Use Of One Listener For Multiple Buttons
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LeftRightPanel extends JPanel {
	
	private JButton leftButton, rightButton;
	private JLabel leftLabel, rightLabel;
	private JPanel leftRightButtonPanel;

	//-----------------------------------------------------------------
	//  Constructor: Sets Up The GUI
	//-----------------------------------------------------------------
	public LeftRightPanel() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(200, 80));
		leftLabel = new JLabel("Push A Button");
		rightLabel = new JLabel();
		leftButton = new JButton("Left");
		rightButton = new JButton("Right");
		leftButton.addActionListener(new LeftRightButtonListener());
		rightButton.addActionListener(new LeftRightButtonListener());
		leftRightButtonPanel = new JPanel();
		leftRightButtonPanel.setBackground(Color.BLUE);
		leftRightButtonPanel.setPreferredSize(new Dimension(200, 40));
		leftRightButtonPanel.add(leftButton);
		leftRightButtonPanel.add(rightButton);
		add(leftLabel);
		add(leftRightButtonPanel);
		add(rightLabel);
	}

	//*****************************************************************
	//  Represents A Listener For Both Buttons
	//*****************************************************************
	private class LeftRightButtonListener implements ActionListener {
		//--------------------------------------------------------------
		//  Determines Which Button Was Pressed And Sets The Label Text Accordingly
		//--------------------------------------------------------------
		@Override
		public void actionPerformed(ActionEvent leftRightEvent) {
			if (leftRightEvent.getSource() == leftButton) {
				leftLabel.setText("Left");
				rightLabel.setText("");
			}
			else {
				rightLabel.setText("Right");
				leftLabel.setText("");
			}
		}
	}
	
}
