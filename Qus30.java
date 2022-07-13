package com.company;
import javax.swing.*;

import java.awt.*;

public class Main{

    public static void main(String args[]) {

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setBounds (100,100,1000, 500);
        Container c=frame.getContentPane();
        c.setLayout (null);

        JButton btn= new JButton("Click Me");

        btn.setSize(100,30);

        btn.setLocation (100,100);

        c.add(btn);

        frame.setVisible(true);
    }
}
