
package input123;

/**
 *
 * @author mshaikh0798
 */

import java.util.*;

public class Input123 {

    
    public static void main(String[] args) {
        // decalre scanner
        Scanner in = new Scanner(System.in);
        String number = null;
        
        
        //declare and assign variables
        System.out.println("Enter 1,2,3and 4. anything else is an error");
        do {
        
        System.out.println("Enter a number");
        number = in.nextLine();
        
        // if statement 
        if (number.equals("4") ) 
        {
           
            
        }
        
        else if (number.equals("1") || number.equals("2") || number.equals("3")) 
        {
            
            System.out.println(" GOOD JOB!");
        }
        
        else 
        {
            System.out.println("ERROR");
            
        }
        }while (!number.equals("4"));
       } 
    }

