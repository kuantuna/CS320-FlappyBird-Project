package flappybird.model.proxy;

import javax.swing.ImageIcon;

public class ProxyImage implements IImage {

    private final String src;
    private RealImage realImage;

    public ProxyImage(String src) {
        this.src = src;
    }
    @Override
    public ImageIcon loadImage() {
        if(realImage == null) {
            this.realImage = new RealImage(src);
        }
        return this.realImage.loadImage();
    }
}
