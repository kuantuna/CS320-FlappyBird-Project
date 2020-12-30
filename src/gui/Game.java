package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {

    private Renderer renderer;

    public Game(){
        setLayout(new GridLayout());
        Timer timer = new Timer(20, this);
        renderer = new Renderer();
        this.add(renderer);
        timer.start();
    }

    public static void repaint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(0,0,Gui.SCREEN_WIDTH,Gui.SCREEN_HEIGHT);
        // Columnlar oluşacak
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }
}
