
package trianglebverifier;

/**TRIANGLE VERIFIAR
 *MARCH 1th 2015
 * @author mshaikh0798
 */

import java.util.*;


public class Trianglebverifier {

    
    public static void main(String[] args) {
        //declare scanner
        Scanner in = new Scanner(System.in);
        
        //declare and assign varibles 
        System.out.println("PLESE ENTER SIDE 1");
        int side1 = in.nextInt();
        
        System.out.println("PLESE ENTER SIDE 2");
        int side2 = in.nextInt();
        
        System.out.println("PLEASE ENTER SIDE 3");
        int side3 = in.nextInt();
        
        int total = side1 + side2;
        
        int total1 = side2 + side3;
        
        int total2 = side3 + side1;
        
        int total3 = side3 + side2;
        
        if (total > side3 && total1 >side1 && total2 >side2 && total3 >side1 )
        {
            System.out.println("Its a triangle");
            
        }
        
        else 
        {
            System.out.println("its not a trangle");
            
        }
    }
}
