package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Container extends JPanel implements ActionListener {
    private static CardLayout cardLayout;
    private static JPanel containerLRPanel, entrancePanel, gamePanel;

    public Container(){
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        containerLRPanel = new ContainerLR();
        entrancePanel = new Entrance();
        gamePanel = new Game();
        // Add here new panels

        this.add(containerLRPanel, "1");
        this.add(entrancePanel, "2");
        this.add(gamePanel, "3");
        // Add here when new panels are added

        cardLayout.show(this, "1");
    }

    public static CardLayout getCardLayout(){
        return cardLayout;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Main.getFrame().repaint(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
