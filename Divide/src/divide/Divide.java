
package divide;

/**
 *
 * @author mshaikh0798
 */

import java.util.*;

public class Divide {

    
    public static void main(String[] args) {
      
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter a number");
        int input = in.nextInt();
        
        System.out.println("Enter a number you wish to divide by");
        int number = in.nextInt();
        
        divide(input,number);
        
    }
    
    public static void divide(int i, int n)
            
    {
        int remainder=i/n;
        
        Math.round(remainder);
        
        int mod =i%n;
        
        System.out.println(n+" goes into " + i+", " + remainder +" times and has a remainder of "+mod);
        
    }
    
}
