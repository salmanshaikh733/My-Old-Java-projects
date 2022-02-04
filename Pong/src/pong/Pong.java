package pong;

/**
 *
 * @author mshaikh0798
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
import java.io.IOException.*;

public class Pong extends Applet implements ActionListener, Runnable {

    //declare these varibales globally
    int level = 1;
    Button play;
    Image bg,paddle;
    
    //global coridinated variable
    int x = 100;
    int y = 200;
    int x1 = 150;
    int y1 = 50;
    int xp = 1660/2;
    int yp = 900;
    int increase = 25;
    int increase1 = 6; // increase to move ball horizontally
    int increase2 = 7; // increase to move ball vertically
  int score =0;
  
  Color c1 = new Color(0,255,128);
    //decalre animator
    Thread animator = new Thread(this);
    
    public void init() {

        //set canvas size
        setSize(1660, 930);

        //set canvas color
        setBackground(c1);


        setLayout(null); // allows user to place objects on screen
        
        //import images 
        Toolkit toolkit =Toolkit.getDefaultToolkit();
        bg=toolkit.getImage("pongbg1.jpg");
        paddle= toolkit.getImage("paddle.jpg");
        
//assign button
        play = new Button("Play Game");

        //add to canvas
        add(play);

        //se location for buttno
        play.setLocation(200, 400);

        //set the size for the button
        /// and add an event listener
        play.setSize(150, 50);
        play.addActionListener(this);
        
    }

    public void run() {

        // while loop for ball to move 
        while (true) {
            try {
                Thread.currentThread().sleep(45);
            } catch (InterruptedException e) {
            }
            if ((x1 < 0) || (x1 > this.size().width - 25)) {
                increase1 *= -1; //does the ball hit the sides?
            } else if (y1 < 5) {
                increase2 *= -1; // does the ball hit the top?
            } else if (((x1 > xp) && (x1 < (xp + 50))) && (((y1+21) > yp - 10) && ((y1) < (yp + 10)))) {
                increase2 *= -1; // does the ball hit the paddle?
                score+=1;
            } else if (y1 > this.size().height) { // does the ball miss?
                level = 0;
                repaint();
                animator.suspend();
            }
            x1 += increase1; // moves the ball
            y1 += increase2;
            repaint();
        }    
    } 
        
   
    public boolean keyDown(Event evt, int key) {

        //keydown method to move paddle 
        if (key == Event.RIGHT) {
            xp += increase;
        } else if (key == Event.LEFT) {
            xp -= increase;
        }
        repaint();
        return true;
    }

    
    public void paint(Graphics g) {
        // what to do if on first screen
        if (level == 1) { // Startup Screen

            g.setColor(Color.WHITE);
            g.setFont(new Font("Impact", Font.BOLD, 30));
            g.drawString("STARTUP SCREEN", 500, 30);

            //what to do when on level 2 screen
        } else if (level == 2) { // Game Screen
            
//g.drawImage(bg,1,1,this);
            //add antialisaing 
            Graphics2D g2d = (Graphics2D)g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            
            
            remove(play);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Impact", Font.BOLD, 60));
            g.drawString("GAME SCREEN", 1525/2,50 );
           // g.drawImage(bg,xp,yp,50,10,this);
            g.setColor(Color.WHITE);
            g.fillRect(xp, yp, 50, 10); //adds the paddle
            g.fillOval(x1, y1, 25, 25); //adds the ball
            
            //output the score
            g.setFont(new Font ("Impact",Font.PLAIN,30));
            g.drawString("Score "+score,50,50);
            

        } else if (level == 0) { // Game Over Screen

            g.setColor(Color.WHITE);
            g.setFont(new Font("Impact", Font.BOLD, 30));
            g.drawString("GAME OVER SCREEN", 500, 30);
        }
    }

    public void actionPerformed(ActionEvent e) {
        
animator.start();
        level = 2;
        repaint();
    }
}
