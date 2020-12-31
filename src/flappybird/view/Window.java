package flappybird.view;

import java.awt.Dimension;
import javax.swing.*;

public class Window {
    public static int WIDTH = 800;
    public static int HEIGHT = 500;
    public Window(int width, int height, String title, Game game) {
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.add(game);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMaximumSize(new Dimension(width, height));
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }
    private static Gui frame;
    public static void main(String[] args) {

        frame = new Gui();

    }
    public static Gui getFrame(){
        return frame;
    }
}
