//package slideshow;
// lines 15 through 20 are the only updated lines.

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class slideShowPanel extends JPanel{ 
  
  
  Image first = new Image("one.gif",'x',"STOP");
  Image second = new Image("two.gif",'x',"STOP");
  Image third = new Image("three.gif",'x',"STOP");
  Image fourth = new Image("four.gif",'x',"STOP");
  ImageIcon[] imageArray = new ImageIcon[] {first.getImage(),
  second.getImage(), third.getImage(), fourth.getImage()};
  
  public JLabel label;
  public Timer timer;
  public int counter;

public slideShowPanel(){
  System.out.println("in slideShowPanel");  
  timer = new Timer(200, new timerListener());
  timer.start();
  
  label = new JLabel();
  counter = 0;
  add(label);
  setPreferredSize(new Dimension(700, 500));
}


// keep showing same state/ image distance until 
// a new input is made?

public class timerListener implements ActionListener{  
  @Override
  public void actionPerformed(ActionEvent e){    
    if(counter >= imageArray.length){
      counter = 0;
    }
    
    
    /*
     * let's say the user slowed down upon seeing
     * a stop sign in the distance. 
     * to "slow down" the images we would 
     * have to show more of are images of the current
     * STATE on the road but still in motion.
     * This means that if a stop sign is in the
     * distance we will still see it at that distance but 
     * the cones will still move simulating movement
     * but we will not see the stop sign appear closer
     * until many more images later than usual.
     */ 
    
    // !!!check state here and decide how to proceed.
    // get correct batch of images depending on current state
    
    label.setIcon(imageArray[counter]);
    counter++;
  }        
}

}