package csc216GUIs;

import java.awt.*;
import javax.swing.*;

public class ExampleGUI extends JFrame {

	public ExampleGUI() {
		Container frameContent = getContentPane();
		
		//...
		
		// set the desired window size and title
		setTitle("ExapleGUI");
		setSize(400,150);
		setVisible(true);
	}
	
	public static void main( String[] args) {
		ExampleGUI application = new ExampleGUI();
	}
}
