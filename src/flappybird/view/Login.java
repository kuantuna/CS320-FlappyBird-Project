package flappybird.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class Login extends JPanel {

    private static JLabel usernameLabel, passwordLabel;
    private static JTextField usernameField;
    private static JPasswordField passwordField;
    private static JButton loginButton;

    public Login() {
        this.setLayout(null);
        this.addUsername();
        this.addPassword();
        this.addLoginButton();
        class LoginButtonActionListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                // Db will be added this is just for test purposes
                String usernameInput = usernameField.getText();
                char[] passwordInput = passwordField.getPassword();
                if(doesCredentialsExist(usernameInput, passwordInput)){
                    JOptionPane.showMessageDialog(((Component) e.getSource()).getParent(),"Success");
                    Window.getFrame().setMinimumSize(new Dimension(Gui.SCREEN_WIDTH,Gui.SCREEN_HEIGHT));
                    Container.getCardLayout().show(Gui.getContainerPanel(),"2");
                    ContainerLR.closeConnection();
                }
                else{
                    JOptionPane.showMessageDialog(((Component) e.getSource()).getParent(),"Invalid credentials");
                }
            }
        }
        loginButton.addActionListener(new LoginButtonActionListener());
    }

    public void addUsername(){
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10, 20, 80, 25);
        this.add(usernameLabel);
        usernameField = new JTextField(20);
        usernameField.setBounds(320, 20, 450, 25);
        this.add(usernameField);
    }

    public void addPassword(){
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        this.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(320,50,450,25);
        this.add(passwordField);
    }

    public void addLoginButton(){
        loginButton = new JButton("Login");
        loginButton.setBounds(320, 80, 450, 25);
        this.add(loginButton);
    }

    public static JTextField getUsernameField() { return usernameField; }
    public static JPasswordField getPasswordField() { return passwordField; }

    private boolean doesCredentialsExist(String usernameInput, char[] passwordInput) {
        try {
            Statement statement = ContainerLR.getConnection().createStatement();
            String selectQuery = "SELECT Username, Password FROM AuthenticationSystem where Username = '" + usernameInput + "' and Password = '" + new String(passwordInput) + "'";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            return resultSet.next();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
