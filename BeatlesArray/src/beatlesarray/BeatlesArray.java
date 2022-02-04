
package beatlesarray;

/**BeatlesArrayExample
 *
 * @author mshaikh0798
 */

//import java util library
import java.util.*;

public class BeatlesArray {

    
    
    
    public static void main(String[] args) {
    
        //dcalre scanner
        Scanner in = new Scanner(System.in);
        
        //declare string array called beatles and assing the array to 4 elemetns
     String beatles[]=new String[4];      
        
     for (int i=0;i<beatles.length;i++)
     {
     //assign the individual elements with names
        System.out.println("Enter the name of a beatle "+(i+1)+":");
     
     beatles[i]=in.nextLine();
  
     }
        
      for (int i=0;i<beatles.length;i++)
      {
          System.out.println("Beatle " + (i+1)+ " " + beatles[i]);
          
      }
          
    }
}
