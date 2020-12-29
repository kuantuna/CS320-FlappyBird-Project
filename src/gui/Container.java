package gui;

import javax.swing.*;
import java.awt.*;

public class Container extends JPanel {
    private static CardLayout cardLayout;
    private static JPanel containerLRPanel, entrancePanel;

    public Container(){
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        containerLRPanel = new ContainerLR();
        entrancePanel = new Entrance();
        add(containerLRPanel, "1");
        add(entrancePanel, "2");
        cardLayout.show(this, "1");
    }

    public static JPanel getEntrancePanel(){
        return entrancePanel;
    }
    public static CardLayout getCardLayout(){
        return cardLayout;
    }
}
