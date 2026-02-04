package cgcccsc110.gui.rebound;

//********************************************************************
//	ReboundPanel.java       Java Foundations
//
//	Represents The Primary Panel For The Rebound Program
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReboundPanel extends JPanel {

	private final int WIDTH = 300, HEIGHT = 100, DELAY = 20, IMAGE_SIZE = 35;
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;
	
	//-----------------------------------------------------------------
	//  Sets Up The Panel, Including The Timer For The Animation
	//-----------------------------------------------------------------
	public ReboundPanel() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		image = new ImageIcon("happyFace.gif");
		timer = new Timer(DELAY, new ReboundListener());
		x = 0;
	    y = 40;
	    moveX = moveY = 3;
	    timer.start();
	}
	
	//-----------------------------------------------------------------
	//  Draws The Image In The Current Location
	//-----------------------------------------------------------------
	@Override
	public void paintComponent(Graphics reboundPage) {
		super.paintComponent(reboundPage);
	    image.paintIcon(this, reboundPage, x, y);
	}
	
	//*****************************************************************
	//  Represents The Action Listener For The Timer
	//*****************************************************************
	private class ReboundListener implements ActionListener {
		//--------------------------------------------------------------
	    //  Updates The Position Of The Image And Possibly The Direction Of Movement Whenever The Timer Fires An Action Event
	    //--------------------------------------------------------------
		@Override
		public void actionPerformed(ActionEvent reboundEvent) {
			x += moveX;
	        y += moveY;
	        if ((x <= 0) || (x >= WIDTH - IMAGE_SIZE)) {
	        	moveX *= -1;
	        }
	        if ((y <= 0) || (y >= HEIGHT - IMAGE_SIZE)) {
	        	moveY *= -1;
	        }
	        repaint();
		}
	}
	
}
