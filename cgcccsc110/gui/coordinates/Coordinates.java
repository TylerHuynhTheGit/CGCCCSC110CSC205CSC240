package cgcccsc110.gui.coordinates;

import javax.swing.*;

public class Coordinates {
	
	public static void main(String[] args) {
		JFrame coordinatesFrame = new JFrame("Coordinates");
		coordinatesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		coordinatesFrame.getContentPane().add(new CoordinatesPanel());
		coordinatesFrame.pack();
		coordinatesFrame.setVisible(true);
	}

}
