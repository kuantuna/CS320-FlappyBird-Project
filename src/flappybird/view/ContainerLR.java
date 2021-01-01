package flappybird.view;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ContainerLR extends JPanel {

    private static final String URL = "jdbc:mysql://localhost:3306/flappybird?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "25501460474On.";

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

    private static JTabbedPane tabs;
    private static Login loginPanel;
    private static Register registerPanel;

    public ContainerLR(){
        try{
            establishConnection();

            this.setLayout(new BorderLayout());
            tabs = new JTabbedPane();

            loginPanel = new Login();
            tabs.add("Login", loginPanel);

            registerPanel = new Register();
            tabs.add("Register", registerPanel);

            this.add(tabs);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static JTabbedPane getTabs(){
        return tabs;
    }

    public static Connection getConnection(){
        return connection;
    }
}
