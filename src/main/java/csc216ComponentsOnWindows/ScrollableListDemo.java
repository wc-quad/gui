package csc216ComponentsOnWindows;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ScrollableListDemo extends JFrame implements ActionListener {

    private ArrayList backendArray = new ArrayList();
    private DefaultListModel model = new DefaultListModel();
    private JList jList = new JList(model);
    private JScrollPane scrollPane = new JScrollPane(jList);
    private JLabel lblName = new JLabel("New Entry");
    private JTextField txtName = new JTextField(10);
    private JButton btnAdd = new JButton("Add");
    private JButton btnRemove = new JButton("Remove");

    public ScrollableListDemo() {
        Container c = this.getContentPane();

        fillModel();
        jList.setFont(new Font("Courier", Font.PLAIN, 12));
        scrollPane.setPreferredSize(new Dimension(230,100));

        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        c.setLayout(new FlowLayout());
        c.add(lblName);
        c.add(txtName);
        c.add(btnAdd);
        c.add(btnRemove);
        c.add(scrollPane);
        setSize(250,200);
        setVisible(true);
    }

    private void fillModel(){
        while (!model.isEmpty())
            model.remove(0);
         for (int k = 0; k < backendArray.size(); k++)
            model.addElement((k+1) + ": " + (String) backendArray.get(k));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnAdd))
            backendArray.add(txtName.getText());
        if (e.getSource().equals(btnRemove)) {
            int[] indexes = jList.getSelectedIndices();
            for (int i = indexes.length-1; i >= 0; i--)
                backendArray.remove(indexes[i]);
        }
        fillModel();
    }

    public static void main(String[] args){
       ScrollableListDemo s = new ScrollableListDemo();
    }
}