package csc216ComponentsOnWindows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChoiceCheckDemo extends JFrame {
    private String[] drinks = {"Cola", "Juice","Water","None"};
    private JComboBox cmbxDrink = new JComboBox(drinks);
    private JCheckBox ckbxPickle = new JCheckBox("Pickles");
    private JCheckBox ckbxLettuce = new JCheckBox("Lettuce");
    private JCheckBox ckbxOnion = new JCheckBox("Onions");
    private JCheckBox ckbxTomato = new JCheckBox("Tomato");
    private JRadioButton btnBurger = new JRadioButton("Burger");
    private JRadioButton btnDog = new JRadioButton("Hot dog");
    private JRadioButton btnSandwich = new JRadioButton("Sandwich");
    private ButtonGroup group = new ButtonGroup();
    JPanel pnlFood = new JPanel();
    JPanel pnlCondiment = new JPanel();

    public ChoiceCheckDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        btnBurger.setSelected(true);
        group.add(btnBurger);
        group.add(btnDog);
        group.add(btnSandwich);
        pnlFood.setLayout(new GridLayout(3,1));
        pnlFood.add(btnBurger);
        pnlFood.add(btnDog);
        pnlFood.add(btnSandwich);

        pnlCondiment.setLayout(new GridLayout(4,1));
        pnlCondiment.add(ckbxPickle);
        pnlCondiment.add(ckbxOnion);
        pnlCondiment.add(ckbxTomato);
        pnlCondiment.add(ckbxLettuce);

        c.add(pnlFood);
        c.add(pnlCondiment);
        c.add(cmbxDrink);

        setSize(300,175);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceCheckDemo();
    }
}