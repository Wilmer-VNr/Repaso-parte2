package org.example;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ingreso de Estudiante");
        frame.setContentPane(new form1().mainPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}