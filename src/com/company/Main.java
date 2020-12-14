package com.company;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // creating frame
        JFrame frame = new JFrame("Shapes GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //TODO write action to buttons
        //buttons
        JButton button = new JButton("Add");
        button.setBounds(450, 40, 100, 30);
        frame.add(button);

        button = new JButton("Create triangle");
        button.setBounds(450, 80, 100, 30);
        frame.add(button);

        button = new JButton("Create rectangle");
        button.setBounds(450, 120, 100, 30);
        frame.add(button);

        button = new JButton("Create circle");
        button.setBounds(450, 160, 100, 30);
        frame.add(button);

        button = new JButton("Create Square");
        button.setBounds(450, 200, 100, 30);
        frame.add(button);

        JLabel label = new JLabel("Shapes:");
        label.setBounds(50, 20, 100, 20);
        frame.add(label);

        //TODO make with file and <Shape>
        //List of shapes
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("first item");
        listModel.addElement("second item");
        JList<String> list = new JList<>(listModel);
        list.setBounds(50, 40, 300, 190);
        frame.add(list);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
