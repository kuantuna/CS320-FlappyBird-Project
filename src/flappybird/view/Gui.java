package flappybird.view;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;

public class Gui extends JFrame {

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    private static java.awt.Container containerPanel;

    public Gui(){

        this.setTitle("Flappy Bird");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
        this.setMinimumSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));

        containerPanel = new java.awt.Container();
        this.add(containerPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static Container getContainerPanel(){
        return containerPanel;
    }
}
