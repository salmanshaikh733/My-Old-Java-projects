
package voter.age;

/**voter age
 *February 23rd 2015
 * @author mshaikh0798
 */

import java.util.Scanner;

public class VoterAge {
    
    public static void main(String[] args) {
        //declare sanner variable
        Scanner in = new Scanner(System.in);
        
        //delcare user input variables
        System.out.println("Please enter your age");
        int userAge = in.nextInt();
        
        
        //declare if statment and output
        if (userAge >= 18)
        {
            System.out.println("\nYOU ARE OLD ENOUGH TO VOTE!!");
            
        }
        else 
        {
            
            System.out.println("\nYOU ARE NOT OLD ENOUGH TO VOTE!!");
        }
                
    }//end of program
}
