
package acid.rain;

/**acid rain
 *March 9th 2015
 * @author mshaikh0798
 */

//import java libraries
import java.text.*;
import java.util.*;

public class AcidRain {

    
    public static void main(String[] args) {
        
        //declare and assign scanner
        Scanner in = new Scanner(System.in);
       
        DecimalFormat Ph = new DecimalFormat("#.#");
        //ask for user input
        System.out.println("Please enter the pH level");
        double pH =in.nextDouble();
        
        // declare if statments 
        
        if (pH < 0 || pH > 14)
        {
            System.out.println(" INVALID ENTRY");
        }
        else if (pH < 6.5)
        {
            System.out.println("\n\tpH level is TOO ACIDIC");
        }
        
        else if (pH > 7.5)
        {
            System.out.println("\n\tpH level is TOO ALKALINE");
        
        }
        
        else if (pH >= 6.5 && pH <= 7.5)
        {
            
            System.out.println("\n\tpH level is NEUTRAL");
            
            
        }
        // end of if statements
     
        // output
        System.out.println("Your pH level is " + Ph.format(pH));
        
    }
    
}// end of program 
