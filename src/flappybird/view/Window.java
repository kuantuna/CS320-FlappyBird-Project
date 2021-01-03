package flappybird.view;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

public class Window {

    public static int WIDTH = 800;
    public static int HEIGHT = 500;

    private static final String URL = "jdbc:mysql://localhost:3306/flappybird?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "gt19981989";

    private static Connection connection = null;

    public static void establishConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public Window(int width, int height, String title, Game game) {

        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.add(game);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMaximumSize(new Dimension(width, height));
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }
    private static Gui frame;
    public static void main(String[] args) {
        frame = new Gui();
    }

    public static Connection getConnection(){
        return connection;
    }
    public static Gui getFrame(){
        return frame;
    }
}