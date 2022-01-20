package imageviewer.ui;

import imageviewer.model.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SwingImageDisplay extends JPanel implements ImageDisplay {
    
    private Image currentImage;

    @Override
    public Image current() {
        return this.currentImage;
    }          

    @Override
    public void show(Image image) {
        this.currentImage = image;
        this.repaint();
    }
    
    @Override
    public void paint(Graphics g){
        if (currentImage != null) 
            g.drawImage(
                    this.ImageOf(currentImage), 
                    0, 
                    0, 
                    this.getWidth(),
                    this.getHeight(),
                    null); 
    }
    
    private BufferedImage ImageOf(Image image){
        try {
            return ImageIO.read(image.stream()); 
        } catch (IOException e) {
            return null;
        }
    }
    
}
