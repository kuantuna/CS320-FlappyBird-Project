package flappybird.view;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class Entrance extends JPanel{

    private static JTabbedPane tabs;
    private static Start startPanel;
    private static Leaderboard leaderboardPanel;
    private Statement statement = null;
    private static JLabel labelUsername1, labelUsername2,labelUsername3,labelUsername4,labelUsername5;
    private JLabel labelScore1,labelScore2,labelScore3,labelScore4,labelScore5;
    private static JLabel label1;
    private static JLabel label2;

    public Entrance(){
        this.setLayout(new BorderLayout());
        tabs = new JTabbedPane();

        startPanel = new Start();
        tabs.add(startPanel, "Start");

        leaderboardPanel = new Leaderboard();
        tabs.add(leaderboardPanel, "Leaderboard");

        labelUsername1 = new JLabel();
        labelScore1 = new JLabel();
        labelUsername2 = new JLabel();
        labelScore2 = new JLabel();
        labelUsername3 = new JLabel();
        labelScore3 = new JLabel();
        labelUsername4 = new JLabel();
        labelScore4 = new JLabel();
        labelUsername5 = new JLabel();
        labelScore5 = new JLabel();

        leaderboardPanel.add(labelUsername1);
        leaderboardPanel.add(labelScore1);
        leaderboardPanel.add(labelUsername2);
        leaderboardPanel.add(labelScore2);
        leaderboardPanel.add(labelUsername3);
        leaderboardPanel.add(labelScore3);
        leaderboardPanel.add(labelUsername4);
        leaderboardPanel.add(labelScore4);
        leaderboardPanel.add(labelUsername5);
        leaderboardPanel.add(labelScore5);

        label1 = new JLabel();
        label2 = new JLabel();

        leaderboardPanel.add(label1);
        leaderboardPanel.add(label2);

        tabs.addChangeListener(e -> {
            if(tabs.getSelectedIndex() == 1){
                try {
                    Window.establishConnection();
                    Statement statement = Window.getConnection().createStatement();
                    String selectQuery = "SELECT Username, Score FROM AuthenticationSystem ORDER BY Score DESC";
                    ResultSet resultSet = statement.executeQuery(selectQuery);
                    int index = 1;
                    while (resultSet.next() && index != 6) {
                        if (index==1)
                        {
                            String username = resultSet.getString("Username");
                            labelUsername1.setText(index + ". " + username);
                            int score = resultSet.getInt("Score");
                            labelScore1.setText(score + "");
                            index++;
                        }
                        else if (index ==2)
                        {
                            String username = resultSet.getString("Username");
                            labelUsername2.setText(index + ". " + username);
                            int score = resultSet.getInt("Score");
                            labelScore2.setText(score + "");
                            index++;
                        }
                        else if (index==3)
                        {
                            String username = resultSet.getString("Username");
                            labelUsername3.setText(index + ". " + username);
                            int score = resultSet.getInt("Score");
                            labelScore3.setText(score + "");
                            index++;
                        }
                        else if(index==4)
                        {
                            String username = resultSet.getString("Username");
                            labelUsername4.setText(index + ". " + username);
                            int score = resultSet.getInt("Score");
                            labelScore4.setText(score + "");
                            index++;
                        }
                        else
                        {
                            String username = resultSet.getString("Username");
                            labelUsername5.setText(index + ". " + username);
                            int score = resultSet.getInt("Score");
                            labelScore5.setText(score + "");
                            index++;
                        }
                    }

                    int rank = 0;
                    int my_score = 0;
                    Window.establishConnection();
                    statement = Window.getConnection().createStatement();
                    String selectQuery3 = "SELECT Score FROM AuthenticationSystem WHERE Username = '"
                            + Login.getUsernameInput() + "'";
                    ResultSet resultSet3 = statement.executeQuery(selectQuery3);
                    while (resultSet3.next()) {
                        my_score = resultSet3.getInt("Score");
                        break;
                    }
                    String selectQuery2 = "SELECT Count(*) FROM AuthenticationSystem WHERE Score > " + my_score;
                    ResultSet resultSet2 = statement.executeQuery(selectQuery2);
                    while (resultSet2.next()) {
                        rank = resultSet2.getInt(1) + 1;
                    }
                    label1.setText("Your score is " + my_score);
                    label2.setText("and you are " + rank + ".");
                    Window.closeConnection();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        this.add(tabs);
    }
}
