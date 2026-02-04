package cgcccsc110.gui.layout;

import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {

	public GridPanel() {
		setLayout(new GridLayout());
		setBackground(Color.GREEN);
		JButton gridButton1 = new JButton("BUTTON 1");
		JButton gridButton2 = new JButton("BUTTON 2");
		JButton gridButton3 = new JButton("BUTTON 3");
		JButton gridButton4 = new JButton("BUTTON 4");
		JButton gridButton5 = new JButton("BUTTON 5");
		add(gridButton1);
		add(gridButton2);
		add(gridButton3);
		add(gridButton4);
		add(gridButton5);
	}
	
}
