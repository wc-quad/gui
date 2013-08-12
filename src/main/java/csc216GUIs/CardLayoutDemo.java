package csc216GUIs;

import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame {

	JButton[] btnArray = new JButton[3];
	String[] cardName = {"one", "two", "three"};
	
	public CardLayoutDemo() {
		Container c = getContentPane();
		c.setLayout(new CardLayout());
		for (int i = 0; i < 3; i++) {
			btnArray[i] = new JButton("Button " + (i+1));
			c.add(btnArray[i], cardName[i]);
		}
		setTitle("CardLayout");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CardLayoutDemo();
	}
}
