package cgcccsc110.gui.layout;

import javax.swing.*;
import java.awt.*;

public class BoxPanel extends JPanel {

	public BoxPanel() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setBackground(Color.GREEN);
		JButton boxButton1 = new JButton("BUTTON 1");
		JButton boxButton2 = new JButton("BUTTON 2");
		JButton boxButton3 = new JButton("BUTTON 3");
		JButton boxButton4 = new JButton("BUTTON 4");
		JButton boxButton5 = new JButton("BUTTON 5");
		add(boxButton1);
		add(boxButton2);
		add(boxButton3);
		add(boxButton4);
		add(boxButton5);
	}
	
}
