package flappybird.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JPanel {

    public Start(){
        JButton startButton = new JButton("START");
        this.add(startButton);
        JButton logoutButton = new JButton("LOGOUT");
        this.add(logoutButton);
        class StartButtonActionListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                Container.getCardLayout().show(Gui.getContainerPanel(),"3");
                Container.getGamePanel().grabFocus();
            }
        }
        class LogoutButtonActionListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                Container.getCardLayout().show(Gui.getContainerPanel(),"1");
            }
        }
        startButton.addActionListener(new StartButtonActionListener());
        logoutButton.addActionListener(new LogoutButtonActionListener());
    }
}