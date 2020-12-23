package gui;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static JFrame frame;
    private static JTabbedPane tabs;
    private static JPanel loginPanel, registerPanel, entrancePanel;

    public static void main(String [] args){
        frame = new JFrame("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 500);
        frame.setMinimumSize(new Dimension(650, 500));
        tabs = new JTabbedPane();

        loginPanel = new Login();
        tabs.add("Login", loginPanel);
        registerPanel = new Register();
        tabs.add("Register", registerPanel);

        entrancePanel = new Entrance();

        frame.add(tabs);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static JFrame getFrame(){
        return frame;
    }
    public static JTabbedPane getTabs(){
        return tabs;
    }
    public static JPanel getLoginPanel() { return loginPanel; }
    public static JPanel getEntrancePanel(){
        return entrancePanel;
    }
}