package cgcccsc110.gui.styleoptions;

//********************************************************************
//	StyleOptionsPanel.java       Java Foundations
//
//	Demonstrates The Use Of Check Boxes
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {

	private JLabel saying;
	private JCheckBox bold, italic;
	
	//-----------------------------------------------------------------
	//  Sets Up A Panel With A Label And Some Check Boxes That Control The Style Of The Label's Font
	//-----------------------------------------------------------------
	public StyleOptionsPanel() {
		setBackground(Color.CYAN);
	    setPreferredSize(new Dimension(300, 100));
		saying = new JLabel("Say It With Style!");
	    saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
	    bold = new JCheckBox("Bold");
	    bold.setBackground(Color.CYAN);
	    italic = new JCheckBox("Italic");
	    italic.setBackground(Color.CYAN);
	    bold.addItemListener(new StyleListener());
	    italic.addItemListener(new StyleListener());
	    add(saying);
	    add(bold);
	    add(italic);
	}
	
	//*****************************************************************
	//	Represents The Listener For Both Check Boxes
	//*****************************************************************
	private class StyleListener implements ItemListener {
		//--------------------------------------------------------------
		//	Updates The Style Of The Label Font Style
		//--------------------------------------------------------------
		@Override
		public void itemStateChanged(ItemEvent styleEvent) {
			int style = Font.PLAIN;
			if (bold.isSelected()) {
				style = Font.BOLD;
			}
			if (italic.isSelected()) {
				style += Font.ITALIC;
			}
			saying.setFont(new Font("Helvetica", style, 36));
		}
	}
	
}
