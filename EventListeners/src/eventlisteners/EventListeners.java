
package eventlisteners;

/**
 *
 * @author mshaikh0798
 */

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class EventListeners extends Applet 

implements ActionListener{
    
    //decalre varibales globally here
    //decalre a textarea
   TextArea txtArea;
   
   //decalrea string add and subtacrct
   String Add, Subtract;
   //decalre ints globally
   int i = 10, j = 20, sum =0,Sub=0;
   
   public void init(){
       
       //set the canvas size to 1000 by 500
      setSize(1000,500);
      
      //set the text area to 10 by 20
      txtArea = new TextArea(10,20);
      
      //set the text area to be editable by the user
      txtArea.setEditable(true);
      
      txtArea.getColumns();
      //add the text area to the canvas
      add(txtArea,"center");
      
      //declare button b and c
      Button b = new Button("Add");
      Button c = new Button("Subtract");
      
      //add event listener to the button
      b.addActionListener(this);
      c.addActionListener(this);
      
      //show buttons on canvas
      add(b);
      add(c);
   }
   public void actionPerformed(ActionEvent e){
      sum = i + j;
      txtArea.setText("");
      txtArea.append("i = "+ i + "\t" + "j = " + j + "\n");
      Button source = (Button)e.getSource();
      if(source.getLabel() == "Add"){
         txtArea.append("Sum : " + sum + "\n");
      }
      if(i >j){
         Sub = i - j;
      }
      else{
         Sub = j - i;
      }
      if(source.getLabel() == "Subtract"){
         txtArea.append("Sub : " + Sub + "\n");
      }
   }
}

