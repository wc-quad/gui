package csc216ComponentsOnWindows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextDemo extends JFrame implements ActionListener {
	private JLabel lblUserInput = new JLabel("You said: ");
	private JTextField txtUserInput = new JTextField(10);
	private JTextArea txtComment = new JTextArea("This is text that will wrap" 
								+ " to the next line. The font stays fixed, but you"
								+ " can scroll down to see the rest if the area.\n\n\n");
	private JScrollPane scrollPane = new JScrollPane(txtComment);
	
	public TextDemo() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		txtUserInput.addActionListener(this);
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(250, 100));
		txtComment.setFont(new Font("Serif", Font.BOLD, 14));
		txtComment.setLineWrap(true);
		txtComment.setWrapStyleWord(true);
		
		c.add(txtUserInput);
		c.add(lblUserInput);
		c.add(scrollPane);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		JTextField userEntry = (JTextField)e.getSource();
		lblUserInput.setText("You said: \"" + userEntry.getText() + "\"");
	}
	
	public static void main(String[] args) {
		new TextDemo();
	}
}
