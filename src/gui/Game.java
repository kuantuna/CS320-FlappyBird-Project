package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {

    private static Renderer renderer;

    public Game(){
        Timer timer = new Timer(20, this);
        renderer = new Renderer();
        this.add(renderer);
        timer.start();
    }

    public static void repaint(Graphics g){
        System.out.println("Hello");
        // Columnlar oluşacak
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }
}
