package gui;

import javax.swing.*;
import java.awt.*;

public class Gui {

    private static JFrame frame;
    private static JTabbedPane tabs;
    private static JPanel loginPanel, registerPanel, entrancePanel;
    private static Thread thread;
    private static final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private static final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public void buildFrame(){
        frame = new JFrame("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setMinimumSize(new Dimension(SCREEN_WIDTH/2, SCREEN_HEIGHT/2));
        tabs = new JTabbedPane();

        buildLoginPage();
        buildRegisterPage();

        buildEntrancePage(); // Not added to frame just created. will be to frame added after user logins successfully.
        thread = new Thread((Runnable) entrancePanel);
        frame.add(tabs);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void buildLoginPage(){
        loginPanel = new Login();
        tabs.add("Login", loginPanel);
    }

    private void buildRegisterPage(){
        registerPanel = new Register();
        tabs.add("Register", registerPanel);
    }

    private void buildEntrancePage(){
        entrancePanel = new Entrance();
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
    public static Thread getThread(){ return thread; }
}
