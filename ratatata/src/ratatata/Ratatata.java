
package ratatata;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 *
 * @author mshaikh0798
 */


public class Ratatata  extends Applet implements MouseMotionListener{

  Image image1;    
    
     Graphics bufferGraphics; 
     
     Image offscreen; 
     
     Dimension dim; 
     int curX, curY;
     
    public void init() {
        
        
        dim = getSize(); 
        
         addMouseMotionListener(this); 
          setBackground(Color.black);
        offscreen = createImage(dim.width,dim.height); 
         bufferGraphics = image1.getGraphics(); 
        
         
         
         Toolkit toolkit =Toolkit.getDefaultToolkit();
     image1=toolkit.getImage("image1.gif");
    }
    
    public void paint (Graphics g)
            
    {
          bufferGraphics.clearRect(0,0,dim.width,dim.width); 
          bufferGraphics.setColor(Color.red); 
          bufferGraphics.drawString("Bad Double-buffered",10,10); 
        bufferGraphics.fillRect(curX,curY,20,20); 
        
       g.drawImage(image1,300,300,this);
        g.drawImage(image1,0,0,this); 
        
    }
    
    public void update(Graphics g) {
    paint(g);
    
    }
    public void mouseMoved(MouseEvent evt)  
     { 
          curX = evt.getX(); 
          curY = evt.getY(); 
          repaint(); 
     } 
 

     // The necessary methods. 
     public void mouseDragged(MouseEvent evt)  
     { 
     }

 
}


