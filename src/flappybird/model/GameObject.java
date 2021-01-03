package flappybird.model;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;

public abstract class GameObject {
    protected int x, y;
    protected int dx, dy;
    protected int width, height;
    protected Image image;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public abstract void tick();
    public abstract void render(Graphics2D g, ImageObserver obs);
}