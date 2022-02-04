
package numberdoubler;

/**
 *
 * @author mshaikh0798
 */

import java.util.*;

public class NumberDoubler {

    //public static double total;
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number");
        double num1=in.nextInt();
        
        // call the NumberDoube method
        //NumberDoubler(num1);
        
        
        //output the answer
        System.out.println("\n The doubled number is "+Math.round(NumberDoubler(num1)));
        
    }// end of main method
    
    public static double NumberDoubler(double n)
    {
        return  (n*2);
        
    }// end of numberDouble method
}
