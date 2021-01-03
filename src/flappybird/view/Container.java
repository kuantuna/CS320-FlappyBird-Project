package flappybird.view;

import javax.swing.*;
import java.awt.*;

public class Container extends JPanel {
    private static CardLayout cardLayout;
    private static Game gamePanel;
    private static ContainerLR containerLRPanel;
    private static Entrance entrancePanel;

    public Container(){
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        containerLRPanel = new ContainerLR();
        entrancePanel = new Entrance();
        gamePanel = new Game();


        this.add(containerLRPanel, "1");
        this.add(entrancePanel, "2");
        this.add(gamePanel, "3");


        cardLayout.show(this, "1");
    }

    public static CardLayout getCardLayout(){
        return cardLayout;
    }
    public static Game getGamePanel(){
        return gamePanel;
    }
}
