package gui;

import javax.swing.*;
import java.awt.*;

public class Entrance extends JPanel{

    private static JTabbedPane tabs;
    private static JPanel startPanel, leaderboardPanel;

    public Entrance(){
        setLayout(new BorderLayout());
        tabs = new JTabbedPane();

        startPanel = new Start();
        tabs.add(startPanel, "Start");

        leaderboardPanel = new Leaderboard();
        tabs.add(leaderboardPanel, "Leaderboard");

        add(tabs);
    }
}
