package mathclasspractice;

/**
 *
 * @author mshaikh0798
 */
//import java classes
import java.util.*;

public class MathClassPractice {

    
    public static void main(String[] args) {
        
        //declare and assign scanner
        Scanner in = new Scanner (System.in);
        
        // user input
        System.out.println("Enter a number to two decimals");
        double userNum=in.nextDouble();
        
        //apply math class methods to the number
        System.out.println("\nAbsolute value "+Math.abs(userNum));
        
        System.out.println("\nNumber rounded up "+Math.ceil(userNum));
         
        System.out.println("\nNumber rounded down "+Math.floor(userNum));
        
        System.out.println("\nSquare root of number "+Math.sqrt(userNum));
        
        System.out.println("\nnumber to the power of 3 "+Math.pow(userNum,3));
        
    }// closes main method
}// end of public class
