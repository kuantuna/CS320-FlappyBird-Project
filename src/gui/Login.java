package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JPanel {

    private static JLabel usernameLabel, passwordLabel;
    private static JTextField usernameField;
    private static JPasswordField passwordField;
    private static JButton loginButton;

    public Login(){
        setLayout(null);

        // Username label and username text field
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10, 20, 80, 25);
        add(usernameLabel);
        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);
        add(usernameField);

        // Password label and password password field
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(100,50,165,25);
        add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        add(loginButton);
        class LoginButtonActionListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                // Db will be added this is just for test purposes
                String usernameInput = usernameField.getText();
                char[] passwordInput = passwordField.getPassword();
                if(doesCredentialsExist(usernameInput, passwordInput)){
                    JOptionPane.showMessageDialog(Main.getLoginPanel(),"Success");
                    Main.getFrame().getContentPane().removeAll(); // Removes all panels
                    Main.getFrame().add(Main.getEntrancePanel());
                    Main.getFrame().revalidate();
                }
                else{
                    JOptionPane.showMessageDialog(Main.getLoginPanel(),"Invalid credentials");
                }
            }
        }
        loginButton.addActionListener(new LoginButtonActionListener());
    }

    public static JTextField getUsernameField() { return usernameField; }
    public static JPasswordField getPasswordField() { return passwordField; }

    private boolean doesCredentialsExist(String usernameInput, char[] passwordInput){
        String registeredUsername1 = "123";
        char[] registeredPassword1 = "123".toCharArray();
        return usernameInput.equals(registeredUsername1) && Arrays.equals(passwordInput, registeredPassword1);
    }
}
