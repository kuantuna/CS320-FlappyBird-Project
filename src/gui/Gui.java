package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {

    public static final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public static final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private static JPanel containerPanel;

    public Gui(){
        Timer timer = new Timer(20, this);

        this.setTitle("Flappy Bird");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setMinimumSize(new Dimension(SCREEN_WIDTH/2, SCREEN_HEIGHT/2));
        containerPanel = new Container();
        this.add(containerPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        timer.start();
    }

    public static JPanel getContainerPanel(){
        return containerPanel;
    }

    public void repaint(Graphics g){ }

    @Override
    public void actionPerformed(ActionEvent e) {
        containerPanel.repaint();
    }
}
