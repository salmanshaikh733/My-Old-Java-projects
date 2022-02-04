
package table.of.squares;

/**
 *
 * @author mshaikh0798
 */

// import java classes
import java.util.*;

public class TableOfSquares {

   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
        System.out.println("Please input a number");
        int userNum =in.nextInt();
        
        for (int i=1; i<=userNum;i++)
        {
            
            int total =i*i;
            System.out.println("The number is " + i +" the squared value is " + Math.round(Math.pow(i,2)));
            
            
        }
        
        
        
    }
}
