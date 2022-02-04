
package repetition;

/** Repetition 
 *March 24th 2015
 * @author mshaikh0798
 */

import java.util.Scanner;

public class Repetition {

    
    public static void main(String[] args) {
        
        //declare variables
       int increment =0;
       String passWord = null;
       String userName=null;
        
        Scanner in = new Scanner(System.in);
      
       //declare do while loop
       do {// promt the user 
           increment++;
           System.out.println("\nATTEMMPT NUMBER " + increment);    
           
        System.out.println("\t\nPlease enter a user name:");
        userName= in.nextLine();
        
        System.out.println("\t\nPlease enter a passoword:");
        passWord = in.nextLine();
        
        //if statement 
         
        if (passWord.equals("LEVAC RULES!") && userName.equals("levac"))
        {
            System.out.println("\nACCESS GRANTED");
            
        }
        
        else 
        {
            
            System.out.println("\nACCESS DENIED");
            
        }
        
        if (increment==3)
        {
            System.out.println("\n\tSORRY TO MANY LOGIN ATTEMPTS!!");
            
        }
        
         
       } while (!passWord.equals("LEVAC RULES!")&&(!userName.equals("levac")&&(increment<=2))); // closes while loop
      
       // output message for too many attempts
       
    } // the main method
    
}// closes calss

