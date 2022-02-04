package firstapplet;

/**First Applet
* Salman Shaikh
* May 26, 2014 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class FirstApplet extends Applet {
    
    Image image1,image2,image3,image4,image5;
    
    
    Color c1 = new Color(50,50,250);
    
 public void init() {
     
     setLayout(null);
     
     setSize(1000,750);
     
     setBackground(Color.CYAN);
     
     Button okButton=null;
 
     Button wrongButton;
 
     TextField nameField;
 
     CheckboxGroup radioGroup;
 
     Checkbox radio1;
     
     
//     //flowlayout
//     setLayout(new FlowLayout());
//     
//     okButton = new Button("I love marshmellows");
//     
//     wrongButton = new Button ("i hate marshmellows");
//     
//     nameField = new TextField("Type something here");
     
     
     
     Toolkit toolkit =Toolkit.getDefaultToolkit();
     image1=toolkit.getImage("download2.gif");
     image2=toolkit.getImage("stormtrooper.gif");
     image3=toolkit.getImage("nosh1.jpg");
     image4=toolkit.getImage("puten.gif");
     image5=toolkit.getImage("japan.gif");
 }
 public void paint(Graphics g) {
     
     
     
 Font f1 = new Font("Stencil", Font.BOLD,36);
 
 Font f2 = new Font("Arial",Font.BOLD,36);
 
 FontMetrics fm =g.getFontMetrics();
 
 
 
 //String text1="My faviorite";
 
 //int x = (getWidth() - fm.stringWidth(text1)) / 2;
 //int y = (getHeight() - fm.getHeight()) + fm.getAscent(); 
 
 //first output
 g.setFont(f1);
 g.setColor(c1);
 g.drawString("My faviorite", 450, 375);
 
 // second output!!
 g.setFont(f2);
 g.setColor(Color.GRAY);
 g.drawString("Dishonoured",300,230);
 
 //third output
 g.setFont(new Font("Impact",Font.BOLD,36));
 g.setColor(Color.MAGENTA);
 g.drawString("The walking dead",Font.ITALIC,43);
 
 //g.drawString("Java applets are cool!!",100,400);
 
 //draw image
 g.drawImage(image1,300,300,this);
 g.drawImage(image2,200,600,this);
  g.drawImage(image3,700,600,this);
   g.drawImage(image4,300,100,this);
   g.drawImage(image5,0,0,this);
   
   
//     g.drawImage(image1,300,300,this);
 
 //add an anuimation 
 
 }
 
}