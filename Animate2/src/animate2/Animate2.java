
package animate2;

/**
 *
 * @author mshaikh0798
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*; 

public class Animate2 extends Applet implements Runnable, ActionListener{
	
	int x, y, increase;
	Button start;
        
        
	Thread animator = new Thread(this);
	
        Image image1;
        
	public void init() {
		
		setLayout(null);  
                
                Toolkit toolkit =Toolkit.getDefaultToolkit();
     image1=toolkit.getImage("gi1.gif");
		
                //code assciated with button
		add(start = new Button ("CLICK FOR ACTION"));
		start.setLocation(200, 150);
		start.setSize(200, 25);
		start.addActionListener(this);
		
                // set initial 
		x = 50;
		y = 50;		
		increase = 5;	
                
                //set background color to blue
		setBackground(Color.white);
                //set sieze to 1000 650
		setSize(1000,650);
	}	
	public void run() {
		
		while (true){
			try { Thread.currentThread().sleep(45); }
			catch (InterruptedException e) {}
				
                        //if the string or image hits the right side of the screen
			if (x > this.size().width-800) {
				increase *= -1;
			}
                        //if it hits the left
			else if (x < 0) {
				increase *= -1;
			}	
			x += increase;
			repaint();
		}		
	}

	public void paint(Graphics g) {
		g.setColor(Color.green);
                g.setFont(new Font("Impact",Font.BOLD,36));
		//g.drawString("Mr. Levac", x, y);
                g.drawImage(image1,x,y,this);
	}
	
	
	public void actionPerformed (ActionEvent e) {
            //starts the animation 
		animator.start();
	}
}
