
package exponent;

/**Exponent
 *May 7th 2015
 * @author mshaikh0798
 */

// import java util library
import java.util.*;

public class Exponent {

    //declare global varible
   // public static double num1,sqred,cubed;
   
    public static void main(String[] args) {
        
        // declare and assign scanner 
        Scanner in = new Scanner (System.in);
        
        // user input
        System.out.println("Enter a number");
        double num1=in.nextDouble();
        
        // call the cubed method
        double cubed =cubed(num1); 
        
        // call the squared method        
        double squared = squared(num1);
                
         //output the final answers
         System.out.println("The cubed number is "+Math.round(cubed)+" The squared value is "+Math.round(squared));
               
        
        
        
    }// end of main method
    
    // cubed method
     public static double cubed(double n)
        {
            
            return (Math.pow(n,3));
        }// end of cubed method
    
     //squared method
     public static double squared(double m)
        {
            return (Math.pow(m,2));
        
        }// end of sqaured method
    
    
}// end of public class
