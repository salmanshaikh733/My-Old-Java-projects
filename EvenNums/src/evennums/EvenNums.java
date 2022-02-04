
package evennums;

/**
 *
 * @author mshaikh0798
 */

//import java calsses
import java.util.*;

public class EvenNums {

    
    public static void main(String[] args) {
       
         Scanner in = new Scanner(System.in);
        
         System.out.println("Please enter a number");
         int userNum = in.nextInt();
        
        for (int i =2 ; i<=userNum; i+=2)
            
        {
          System.out.print(i +" " );
          
          if(i%20 == 0)
          {
              System.out.println("\n");
        }
        
        
        
    }
}
    
}