
package eggs;

/**Eggs
 *April 16th 2015
 * @author mshaikh0798
 */

import java.util.*;

public class EGGS {

    
    public static void main(String[] args) {
Scanner in= new Scanner(System.in);

        // ask for user input
        System.out.println("How many eggs do you have");
        double eggs=in.nextDouble();
        
        //declare if statement
        if(eggs>=12)
        {
            // an int divided by an int will return an int, and will cut off any decimals
            double dozen=eggs/12;
            
            // calculate for a dozen
            double remainder = eggs%12;
            
            // delcare if statment for when reminader is not 0
            if (remainder!=0)
            {
            System.out.println("you have "+Math.round((dozen))+" dozens"+" And have remainder of " +Math.round(Math.abs(remainder)));
         
        }
        
            else if (remainder==0)
            {
                
                System.out.println("you have "+Math.round((dozen))+" dozens of eggs");
            }
            
        }
        
        else 
        {
            
            System.out.println("YOU HAVE LESS THAN A DOZEN");
        }
       
    }
}
