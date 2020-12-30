package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Rectangle;

public class Game extends JPanel implements ActionListener {

    private Renderer renderer;

    public static Rectangle bird;
    private static int WIDTH = 800;
    private static int HEIGHT = 600;

    public Game(){
        setLayout(new GridLayout());
        Timer timer = new Timer(20, this);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
        renderer = new Renderer();

        this.add(renderer);

        timer.start();
    }

    public static void repaint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(0,0,800,800);

        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.orange);
        g.fillRect(0, HEIGHT - 150, WIDTH, 120);

        g.setColor(Color.green);
        g.fillRect(0, HEIGHT - 150, WIDTH, 20);

        g.setColor(Color.red);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);
    }

    @Override
    public void actionPerformed(ActionEvent e) { renderer.repaint(); }
}
