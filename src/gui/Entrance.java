package gui;

import javax.swing.*;
import java.awt.*;

public class Entrance extends JPanel{

    private static JTabbedPane tabs;
    private static Start startPanel;
    private static Leaderboard leaderboardPanel;

    public Entrance(){
        this.setLayout(new BorderLayout());
        tabs = new JTabbedPane();

        startPanel = new Start();
        tabs.add(startPanel, "Start");

        leaderboardPanel = new Leaderboard();
        tabs.add(leaderboardPanel, "Leaderboard");

        this.add(tabs);
    }
}
