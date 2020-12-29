package gui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {


    private static JPanel containerPanel;
    private static final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private static final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public Gui(){
        setTitle("Flappy Bird");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setMinimumSize(new Dimension(SCREEN_WIDTH/2, SCREEN_HEIGHT/2));
        containerPanel = new Container();
        add(containerPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static JPanel getContainerPanel(){
        return containerPanel;
    }
}
