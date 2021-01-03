package flappybird.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


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