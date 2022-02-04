
package methodshandson1;

/**Method hands on 1
 *April 30th 2015
 * @author mshaikh0798
 */

//import java util class
import java.util.*;

public class Methodshandson1 {

    
    public static void main(String[] args) {
       //declare and assing Scanner 
        Scanner in = new Scanner(System.in);
        
        // program intro
        System.out.println("\t*** Demograph checker");
        
        // ask for user input
        System.out.print("\nEnter your postal code: ");
        String postalCode=in.nextLine();
        
        System.out.print("Enter your gender: ");
        String gender =in.nextLine();
        
        System.out.print("Enter your annual Income: ");
        double income=in.nextDouble();
        
        // check postal code lenght
        int length=postalCode.length();
        
        // condition for postal code length
        if (length!=7)
        { 
            System.out.println("Invalid Postal Code.");
        }
        
        else 
        {
            System.out.println("Valid postal code.");
        }
        
        // get first letter of gender information
        String firstChar =gender.charAt(0)+"";
    
        if (firstChar.equalsIgnoreCase("M")||(firstChar.equalsIgnoreCase("F")))
        
        {
            System.out.println("Valid gender.");   
        }
        
        else 
        {   
           System.out.println("Invalid gender.");    
        }
        
        // check if annual income is negative
        if (income<0)
        { 
            System.out.println("Invalid Income. "); 
        }
            
        else 
        {
            System.out.println("Valid Income.");
        }
        // end of if statments
               
    }// end of main method
    
    
}
