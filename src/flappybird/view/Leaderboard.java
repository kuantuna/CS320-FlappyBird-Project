package flappybird.view;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class Leaderboard extends JPanel {

    public Leaderboard(){
        setLayout(new GridLayout(0,2));
        try{
            Window.establishConnection();
            Statement statement = Window.getConnection().createStatement();
            String selectQuery = "SELECT Username, Score FROM AuthenticationSystem ORDER BY Score DESC";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            int index = 1;
            while(resultSet.next() && index!=6)
            {
                String username = resultSet.getString("Username");
                JLabel label1 = new JLabel(index + ". " + username);
                int score = resultSet.getInt("Score");
                JLabel label2 = new JLabel(score + "");
                add(label1);
                add(label2);
                index++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}