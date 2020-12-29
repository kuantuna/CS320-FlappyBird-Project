package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {

    private static final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private static final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private static JPanel containerPanel;
    private static Timer timer;

    public Gui(){
        timer = new Timer(20, this);

        setTitle("Flappy Bird");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setMinimumSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        containerPanel = new Container();
        add(containerPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        timer.start();
    }

    public static JPanel getContainerPanel(){
        return containerPanel;
    }

    public void repaint(Graphics g){
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        containerPanel.repaint();
    }
}
