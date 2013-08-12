package csc216ComponentsOnWindows;

import javax.swing.*;
import java.awt.*;

public class LabelButtonDemo extends JFrame {

	private JButton btnClick = new JButton("Click Me");
	private JLabel lblMessage = new JLabel("This Button doesn't work!");
	
	public LabelButtonDemo() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(lblMessage);
		c.add(btnClick);
		setSize(250, 75);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelButtonDemo();
	}
}


