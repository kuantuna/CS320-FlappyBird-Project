package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JPanel {

    public Start(){
        JButton startButton = new JButton("START");
        add(startButton);
        class StartButtonActionListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                Container.getCardLayout().show(Gui.getContainerPanel(),"3");
            }
        }
        startButton.addActionListener(new StartButtonActionListener());
    }
}
