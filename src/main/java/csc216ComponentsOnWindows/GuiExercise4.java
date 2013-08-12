package csc216ComponentsOnWindows;

import java.awt.*;
import javax.swing.*;

import javax.swing.JPanel;

public class GuiExercise4 extends JFrame {
	private JButton btnTop = new JButton("Top Button");
	private JButton btnBottom = new JButton("Bottom Button");
	private RedButton btnMiddle1 = new RedButton("Red Button");
	private JButton btnMiddle2 = new JButton("Middle Button 2");
	private JButton btnMiddle3 = new JButton("Middle Button 3");
	private JButton btnMiddle4 = new JButton("Middle Button 4");
	private JPanel pnlMiddle = new JPanel();
	
	public GuiExercise4() {
		Container c = getContentPane();
		c.add(btnTop, BorderLayout.NORTH);
		c.add(btnBottom, BorderLayout.SOUTH);
		
		pnlMiddle.add(btnMiddle1);
		pnlMiddle.add(btnMiddle2);
		pnlMiddle.add(btnMiddle3);
		pnlMiddle.add(btnMiddle4);
		c.add(pnlMiddle, BorderLayout.CENTER);
		
		setSize(500, 175);
		setTitle("GUI Exercise");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiExercise4();
	}

}
