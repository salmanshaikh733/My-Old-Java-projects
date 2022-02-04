
package voter.age;

/**
 *
 * @author mshaikh0798
 */

import java.util.Scanner;

public class VoterAge {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter your age");
        int userAge = in.nextInt();
        
        if (userAge >= 18)
        {
            System.out.println("\nYOU ARE OLD ENOUGH TO VOTE");
            
        }
        else 
        {
            
            System.out.println("\nYOU ARE NOT OLD ENOUGH TO VOTE!!");
        }
        
        
        
    }
}
