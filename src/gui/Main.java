package gui;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args){
        JFrame frame = new JFrame("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 500);
        frame.setMinimumSize(new Dimension(650, 500));
        // For tabs
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel loginPanel = new Login();
        tabbedPane.add("Login", loginPanel);
        JPanel registerPanel = new Register();
        tabbedPane.add("Register", registerPanel);
        frame.add(tabbedPane);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}