/*
 * Michael Pedraza
 * CS 440 Software Engineering 1
 * Image class
 *
 */


import javax.swing.ImageIcon;

public class Image{
  private ImageIcon theImage;
  private char designation;
  private String state;

  
  /*
   * This is the constructor for Image objects.
   * It takes a string/filename, a character, and
   * a string as parameters.
   * 
   * theImage corresponds to the
   * filename which specifies a single image.
   * 
   * designation corresponds to what the user
   * should do at this given image.
   * 
   * state corresponds to the "state" of
   * the simulator.  For example, if a Stop sign is
   * in the distance the current state is "STOP".
   * This allows the simulator to know and anticipate
   * what may or may not happen.  For example, if the user
   * begins to slow down once they see the Stop sign
   * the program will check the state.  The state in this case
   * is "Stop" and will then grab a batch of
   * images corresponding to this state that will simulate that
   * the user is slowing down.
   */
  
  protected Image(String singleImage, char sign, String s){
    theImage = new ImageIcon(singleImage);
    designation = sign;
    state = s;
  }
  
  // getImage method
  public ImageIcon getImage(){
    return theImage;
}
  
}