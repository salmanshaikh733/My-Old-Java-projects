
package animate1;

/**
 *
 * @author mshaikh0798
 */

//
import java.awt.*;
import java.applet.*;

public class Animate1 extends Applet implements Runnable{
	
int x, y,i, increase;

// this declares the animator 
Thread animator = new Thread(this);
	
	public void init() {
            //set size
            setSize(1000,650);
            
            //set position of image at 0,0
		x = 0;
		y = 0;
		increase = 1;
		setBackground(Color.magenta);
		
      animator.start();
     
	}

	public void run() {
            
		for ( i = 0; i <=600; i++) {
			try { Thread.currentThread().sleep(30); }
			catch (InterruptedException e) {}
			x += increase;
			y += increase;
			
			repaint();
                        
		}
		
                
	}
	
	public void paint (Graphics g) {
            //set rectangle color to black and start at 50,50
            String str=Integer.toString(i);
		g.setColor(Color.black);
                Integer.toString(i);
                g.drawString(str,500,500);
		g.fillRect(x,y,50,50);	
	}
	
}
