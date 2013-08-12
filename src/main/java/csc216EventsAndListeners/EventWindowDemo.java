package csc216EventsAndListeners;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class EventWindowDemo extends JFrame implements WindowListener,
		ActionListener {

	private int count = 0;
    private JLabel lblCount = new JLabel("The count is: 0 ");
    private JButton btnCount = new JButton("Count");
    private JButton btnQuit = new JButton("Quit");

    public EventWindowDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(lblCount);
        c.add(btnCount);
        c.add(btnQuit);
        btnCount.addActionListener(this);
        btnQuit.addActionListener(this);
        addWindowListener(this);
        setSize(300, 75);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnQuit))
            System.exit(0);
        if (e.getSource().equals(btnCount))
            lblCount.setText("The count is: " + ++count);
    }
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	public static void main(String[] args) {
		EventWindowDemo instance = new EventWindowDemo();
	}
}
