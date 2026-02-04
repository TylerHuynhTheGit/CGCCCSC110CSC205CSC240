package cgcccsc110.gui.coordinates;

//********************************************************************
//	CoordinatesPanel.java       Java Foundations
//
//	Represents The Primary Panel For The Coordinates Program
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CoordinatesPanel extends JPanel {
	
	private final int SIZE = 6; // Diameter Of Dot
	private int x = 50, y = 50; // Coordinates Of Mouse Press

	//-----------------------------------------------------------------
	//  Constructor: Sets Up This Panel To Listen For Mouse Events
	//-----------------------------------------------------------------
	public CoordinatesPanel() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(300, 200));
		addMouseListener(new CoordinatesListener());
	}

	//-----------------------------------------------------------------
	//  Draws All Of The Dots Stored In The List
	//-----------------------------------------------------------------
	@Override
	public void paintComponent(Graphics coordinatesPage) {
		super.paintComponent(coordinatesPage);
		coordinatesPage.setColor(Color.GREEN);
		coordinatesPage.fillOval(x, y, SIZE, SIZE);
		coordinatesPage.drawString("Coordinates: (" + x + ", " + y + ")", 5, 15);
	}

	//*****************************************************************
	//  Represents The Listener For Mouse Events
	//*****************************************************************
	private class CoordinatesListener implements MouseListener {
		//--------------------------------------------------------------
		//  Adds The Current Point To The List Of Points And Redraws The Panel Whenever The Mouse Button Is Pressed
		//--------------------------------------------------------------
		@Override
		public void mousePressed(MouseEvent coordinatesEvent) {
			x = coordinatesEvent.getX();
			y = coordinatesEvent.getY();
			repaint();
		}
		//--------------------------------------------------------------
		//  Provide Empty Definitions For Unused Event Methods
		//--------------------------------------------------------------
		@Override
		public void mouseClicked(MouseEvent coordinatesEvent) {}
		@Override
		public void mouseReleased(MouseEvent coordinatesEvent) {}
		@Override
		public void mouseEntered(MouseEvent coordinatesEvent) {}
		@Override
		public void mouseExited(MouseEvent coordinatesEvent) {}
	}
	
}
