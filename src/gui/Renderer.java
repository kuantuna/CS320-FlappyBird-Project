package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Renderer extends JPanel implements ActionListener {

    public Renderer(){

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Game.repaint(g); // Degisebilir
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
