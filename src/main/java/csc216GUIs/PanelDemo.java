package csc216GUIs;

import java.awt.*;
import javax.swing.*;

public class PanelDemo extends JFrame {
	
	JPanel pnlText = new JPanel();
	JPanel pnlGrid = new JPanel();
	JPanel pnlButtons = new JPanel();
	
	public PanelDemo() {
		Container c = getContentPane();
		
		pnlText.setLayout(new BorderLayout());
		pnlText.add(new JLabel("Name"), BorderLayout.WEST);
		pnlText.add(new TextField(10), BorderLayout.EAST);
		c.add(pnlText, BorderLayout.WEST);
		
		pnlGrid.setLayout(new GridLayout(2,3));
	    for (int i = 0; i < 6; i++)
	        pnlGrid.add(new JButton("" + (i + 1)));
	    c.add(pnlGrid, BorderLayout.EAST);
	        
	    pnlButtons.add(new JButton("Start"));
	    pnlButtons.add(new JButton("Quit"));
	    c.add(pnlButtons, BorderLayout.SOUTH);
	        
	    setTitle("Panel Demo");
	    setSize(400,150);
	    setVisible(true);
	}

	public static void main(String args[]) {
	     new PanelDemo();
	}
	
}
