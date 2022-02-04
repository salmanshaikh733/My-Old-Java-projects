
package erosion;

/**
 *
 * @author mshaikh0798
 */

import java.text.*;

public class EROSION {
   
    
    public static void main(String[] args) {
        // declare decoimal format 
        DecimalFormat soil1 = new DecimalFormat("##.#");
        // declare and asign variables 
        int year=0;
        double soil = 30;
        
        //declare while loop
        while(soil>=9)
        {
        //output the week and allowacnce 
         System.out.println("In year " + year + " the top soil depth will be "+ soil1.format(soil)+"cm");
         
         //calculations
         soil*=0.99;
         year++;
         //soil = outcome-outcome;   
         
        } // end of while loop
        
        // final output  
       System.out.println("In year " + year + " the top soil depth will be "+ soil1.format(soil)+"cm");
    }
    
}
