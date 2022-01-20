package imageviewer.controller;

import imageviewer.persistence.ImageLoader;
import imageviewer.ui.ImageDisplay;
import imageviewer.ui.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
    
    private ImageDisplay imageDisplay;
    private final ImageLoader imageLoader;

    public MainFrame(ImageLoader imageLoader) {
        this.imageLoader=imageLoader;
        
        this.setTitle("Image Viewer"); 
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        this.setSize(800,600);
        this.setLocationRelativeTo(null); 
        this.getContentPane().add(this.imageDisplay()); 
        this.getContentPane().add(toolBar(),BorderLayout.SOUTH); 
        this.setVisible(true);
    }
    
    private JPanel imageDisplay(){
        SwingImageDisplay sid = new SwingImageDisplay(); 
        this.imageDisplay = sid;
        return sid;
    }
    
    private JPanel toolBar(){
        JPanel panel = new JPanel(); 
        panel.add(prevButton()); 
        panel.add(nextButton()); 
        return panel;
    }
    
    private JButton nextButton(){
        JButton button = new JButton(">"); 
        button.addActionListener(nextImage()); 
        return button;
    }
    
    private ActionListener nextImage(){
        return e -> imageDisplay.show(imageLoader.next());
    }
    
    private JButton prevButton(){
        JButton button = new JButton("<"); 
        button.addActionListener(prevImage()); 
        return button;
    }
    
    private ActionListener prevImage(){
        return e -> imageDisplay.show(imageLoader.prev());
    }
    
    public ImageDisplay getImageDisplay(){
        return this.imageDisplay;
    }
    
}