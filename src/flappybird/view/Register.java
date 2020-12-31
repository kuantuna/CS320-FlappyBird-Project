package flappybird.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JPanel {

    private static JTextField usernameField;
    private static JPasswordField passwordField, passwordFieldAgain;
    private static JButton registerButton;

    public Register(){
        this.setLayout(null);
        this.addUsername();
        this.addPassword();
        this.addPasswordAgain();
        this.addRegisterButton();
        class RegisterButtonActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                // If username exists -> option pane

                // If not -> save to the db
                Login.getUsernameField().setText(usernameField.getText());
                Login.getPasswordField().setText("");
                usernameField.setText("");
                passwordField.setText("");
                passwordFieldAgain.setText("");
                ContainerLR.getTabs().setSelectedIndex(0);
            }
        }
        registerButton.addActionListener(new RegisterButtonActionListener());
    }

    public void addUsername(){
        // Username label and username text field
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10, 20, 80, 25);
        this.add(usernameLabel);
        usernameField = new JTextField(20);
        usernameField.setBounds(320, 20, 450, 25);
        this.add(usernameField);
    }

    public void addPassword(){
        // Password label and password password field
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        this.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(320,50,450,25);
        this.add(passwordField);
    }

    public void addPasswordAgain(){
        // Password label and password password field "again"
        JLabel passwordLabelAgain = new JLabel("Password (Again)");
        passwordLabelAgain.setBounds(10, 80, 120, 25);
        this.add(passwordLabelAgain);
        passwordFieldAgain = new JPasswordField(20);
        passwordFieldAgain.setBounds(320,80,450,25);
        this.add(passwordFieldAgain);
    }

    public void addRegisterButton(){
        registerButton = new JButton("Register");
        registerButton.setBounds(320, 110,450,25);
        this.add(registerButton);
    }
}
