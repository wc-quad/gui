package csc216GUIs;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
	
	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("Button 2");
	JButton btn3 = new JButton("Button 3");
	JButton btn4 = new JButton("Button 4");
	JButton btn5 = new JButton("Button 5");
	
	public FlowLayoutDemo() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		setTitle("FlowLayout");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
}
