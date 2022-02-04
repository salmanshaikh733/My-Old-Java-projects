
package buttonapplet;

/**
 *
 * @author mshaikh0798
 */

//import java appplet methods
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ButtonApplet extends Applet {
    
 public void init() {
     
     //construct new button 
     Button beep = new Button ("Beep");
     
     
     //add the button to the layout
     this.add(beep);
     
     //specify the action evens sent by this 
     
     beep.addActionListener(new ButtonApplet());
 }
 
    @Override
 public void paint(Graphics g) {
        
     
 g.drawString("First Applet", 50, 60);
 
 
 }
 
}