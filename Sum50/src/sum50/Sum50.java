
package sum50;

/**Sum 50
 *April 8th 2015
 * @author mshaikh0798
 */

import java.util.*;

public class Sum50 {

    
    public static void main(String[] args) {
    
     Scanner in= new Scanner(System.in);
     
     System.out.println("input a number value");
     int userNum =in.nextInt();
     
     
     int sum =0;
     
     for (int run=1; run<=userNum; run++)
     {
         
         
         
         
         sum = sum+run;
     }
        System.out.println("the sum is "+sum);
        
        
        
        
    }
    }
    