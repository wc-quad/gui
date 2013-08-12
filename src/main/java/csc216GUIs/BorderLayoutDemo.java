package csc216GUIs;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {

	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("Button 2");
	JButton btn3 = new JButton("Button 3");
	JButton btn4 = new JButton("Button 4");
	JButton btn5 = new JButton("Button 5");
	
	public BorderLayoutDemo() {
		Container c = getContentPane();
		c.add(btn1, BorderLayout.NORTH);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.CENTER);
		c.add(btn4, BorderLayout.EAST);
		c.add(btn5, BorderLayout.SOUTH);
		setTitle("BorderLayout");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}
