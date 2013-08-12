package csc216GUIs;

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame {

	JButton btn1 = new JButton("Button 1");
	  JButton btn2 = new JButton("Button 2");
	  JButton btn3 = new JButton("Button 3");
	  JButton btn4 = new JButton("Button 4");

	  public GridLayoutDemo() {
	     Container c = getContentPane();
	     c.setLayout(new GridLayout(2,2));
	     c.add(btn1);
	     c.add(btn2);
	     c.add(btn3);
	     c.add(btn4);
	     setTitle("GridLayout");
	     setVisible(true);
	  }

	  public static void main(String args[]) {
	     new GridLayoutDemo();
	  }

}
