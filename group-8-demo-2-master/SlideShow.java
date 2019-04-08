//package slideshow;

import javax.swing.JFrame;

public class SlideShow {
  
  public static void main(String[] args) {
    
    JFrame frame = new JFrame("Flipbook");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new slideShowPanel());
    frame.setResizable(false);
    frame.pack();
    frame.setVisible(true);
  }
}