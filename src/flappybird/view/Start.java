package flappybird.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JPanel {

    public Start(){
        JButton startButton = new JButton("START");
        this.add(startButton);
        class StartButtonActionListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                Container.getCardLayout().show(Gui.getContainerPanel(),"3");
                Container.getGamePanel().grabFocus();
            }
        }
        startButton.addActionListener(new StartButtonActionListener());
    }
}