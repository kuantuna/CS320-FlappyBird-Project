package gui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public static final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public static final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private static Container containerPanel;

    public Gui(){


        this.setTitle("Flappy Bird");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setMinimumSize(new Dimension(SCREEN_WIDTH/2, SCREEN_HEIGHT/2));
        containerPanel = new Container();
        this.add(containerPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static Container getContainerPanel(){
        return containerPanel;
    }

}
