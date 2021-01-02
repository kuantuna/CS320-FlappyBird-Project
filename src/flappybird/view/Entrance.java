package flappybird.view;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class Entrance extends JPanel{

    private static JTabbedPane tabs;
    private static Start startPanel;
    private static Leaderboard leaderboardPanel;
    private Statement statement = null;
    private boolean firstEntrance = true;

    public Entrance(){
        this.setLayout(new BorderLayout());
        tabs = new JTabbedPane();

        startPanel = new Start();
        tabs.add(startPanel, "Start");

        leaderboardPanel = new Leaderboard();
        tabs.add(leaderboardPanel, "Leaderboard");

        tabs.addChangeListener(e -> {
            if(tabs.getSelectedIndex() == 1){
                if(firstEntrance) {
                    int rank = 0;
                    int my_score = 0;
                    try {
                        Window.establishConnection();
                        statement = Window.getConnection().createStatement();
                        String selectQuery = "SELECT Score FROM AuthenticationSystem WHERE Username = '"
                                + Login.getUsernameInput() + "'";
                        ResultSet resultSet = statement.executeQuery(selectQuery);
                        while (resultSet.next()) {
                            my_score = resultSet.getInt("Score");
                            break;
                        }
                        String selectQuery2 = "SELECT Count(*) FROM AuthenticationSystem WHERE Score > " + my_score;
                        ResultSet resultSet2 = statement.executeQuery(selectQuery2);
                        while (resultSet2.next()) {
                            rank = resultSet2.getInt(1) + 1;
                        }
                        Window.closeConnection();
                        JLabel label1 = new JLabel("Your score is " + my_score);
                        JLabel label2 = new JLabel("and you are " + rank + ".");
                        leaderboardPanel.add(label1);
                        leaderboardPanel.add(label2);
                        Window.closeConnection();
                        firstEntrance = false;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        firstEntrance = false;
                    }
                }
            }
        });

        this.add(tabs);
    }
}
