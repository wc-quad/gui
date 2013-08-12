package csc216ComponentsOnWindows;

import java.awt.Color;
import java.awt.Color.*;
import javax.swing.JButton;

public class RedButton extends JButton {
	
	public RedButton() {
		setForeground(Color.RED);
	}
	
	public RedButton(String text) {
		super(text);
		setForeground(Color.RED);
	}
}
