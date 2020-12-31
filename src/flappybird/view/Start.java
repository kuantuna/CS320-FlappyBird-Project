package flappybird.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import static flappybird.view.Window.*;

public class Start extends JPanel {

    public Start(){
        JButton startButton = new JButton("START");
        this.add(startButton);
        class StartButtonActionListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                Container.getCardLayout().show(Gui.getContainerPanel(),"3");

                Game game = new Game();

                java.awt.EventQueue.invokeLater(() -> {

                    Window window = new Window(WIDTH, HEIGHT, "Flappy Bird", game);

                });
            }
        }
        startButton.addActionListener(new StartButtonActionListener());
    }
}
