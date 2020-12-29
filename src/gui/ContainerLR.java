package gui;

import javax.swing.*;
import java.awt.*;

public class ContainerLR extends JPanel {

    private static JTabbedPane tabs;
    private static JPanel loginPanel, registerPanel;

    public ContainerLR(){
        setLayout(new BorderLayout());
        tabs = new JTabbedPane();

        loginPanel = new Login();
        tabs.add("Login", loginPanel);

        registerPanel = new Register();
        tabs.add("Register", registerPanel);

        add(tabs);
    }

    public static JTabbedPane getTabs(){
        return tabs;
    }
}
