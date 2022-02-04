
package cointoss;

/**
 *
 * @author mshaikh0798
 */

import javax.swing.*;

public class CoinToss {

    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null," WELCOME TO COIN TOSS","Coin Toss",JOptionPane.PLAIN_MESSAGE);
        
        //random number variable 
        String userInput =null;
        
        double randomNum = Math.random();
        
        int attempts=0;
        
        String outcome=null;
        
        do{
        attempts++;
            
        userInput =JOptionPane.showInputDialog(null,"HEADS OR TAILS, GEUSS!!","Coin Toss",JOptionPane.PLAIN_MESSAGE);
        //output number 
        
       
       if (randomNum<0.5)
       {
           outcome="Heads";
           
       }
        
       else 
       {
           outcome="Tails";
         
       }
       
        
            
            if (outcome.equalsIgnoreCase(userInput))
            {
                JOptionPane.showMessageDialog(null, outcome+" You were right\n \tIt took you "+attempts +" attempts","Coin Toss",JOptionPane.PLAIN_MESSAGE );
                
                
            }
            
            else 
            {
                
                JOptionPane.showMessageDialog(null,outcome+" You were wrong","Coin Toss",JOptionPane.PLAIN_MESSAGE);
                      
            }
            System.out.println(randomNum);
            
        }while(!outcome.equalsIgnoreCase(userInput)||attempts>=5);
        
        JOptionPane.showMessageDialog(null, "ALRIGHT SEEMS LIKE YOU FAIL AT THIS GAME!!","Coin Toss",JOptionPane.PLAIN_MESSAGE);
    }
}
