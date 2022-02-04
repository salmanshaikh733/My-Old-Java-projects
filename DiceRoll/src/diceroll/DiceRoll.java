
package diceroll;

/**Dice Roll
 *March 31st, 2015
 * @author mshaikh0798
 */

import java.util.*;
import javax.swing.*;

public class DiceRoll {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
        int randomNum = (int)(Math.random()*6+1);
        
        int randomNum1 = (int)(Math.random()*6+1);
        
        int total = randomNum1+randomNum;
         
        double wager = 100;
               
        double bet =0;
        
        double outcome =0;
        System.out.println("Place your bet");
        bet = in.nextDouble(); 
        
        double wTotal = wager+bet;
        
        
        System.out.println("You rolled "+ total);
        
        if (total==7)
        {
            bet*=2;
            wTotal=bet+wager;
            System.out.println(wTotal);
        }
        
        else if (total ==2||total==12)
            
        {
            bet*=3;
            wTotal=bet+wager;
            System.out.println(wTotal);
        }
        
        else 
        {
            outcome= wager-bet; 
            System.out.println(outcome);
        }
        
        
    }
    
}
