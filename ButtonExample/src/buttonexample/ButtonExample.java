
package buttonexample;

/**
 *
 * @author mshaikh0798
 */

//import java librarires for applet
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonExample extends Applet 



{
    
    public void init()
    {
        //create a button
        Button button1 = new Button();
        
        button1.setLabel("Button test");
        
        //create text area
        TextArea text2;
        
        text2 = new TextArea (15,20);
        
        text2.setEditable(true);
        
        add(text2,"centre");
        //adds the button to the output
        add(button1);
    }
    
    public void output (ActionEvent e)
            
    {
        
        
        
    }
    
    
}
