package gui;

import javax.swing.*;
import java.awt.*;

public class ContainerLR extends JPanel {

    private static JTabbedPane tabs;
    private static Login loginPanel;
    private static Register registerPanel;

    public ContainerLR(){
        this.setLayout(new BorderLayout());
        tabs = new JTabbedPane();

        loginPanel = new Login();
        tabs.add("Login", loginPanel);

        registerPanel = new Register();
        tabs.add("Register", registerPanel);

        this.add(tabs);
    }

    public static JTabbedPane getTabs(){
        return tabs;
    }
}
