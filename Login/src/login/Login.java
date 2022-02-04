
package login;

/**
 *
 * @author mshaikh0798
 */

import java.util.*;

public class Login {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your favourite color");
        String color=in.nextLine();
        
        System.out.println("Enter your favorite animal");
        String animal=in.nextLine();
        
        System.out.println("Enter your phone number without any spaces, dashses or bracktets");
        String phoneNum =in.nextLine();
        
        
        //generate user id
        String userID=(color.charAt(0)+""+animal.substring(0,3)+phoneNum.substring(phoneNum.length()-3));
        
        //convert to lower case
        userID=userID.toLowerCase();
        
        String password = ""+color.charAt(2)+""+phoneNum.charAt(2)+""+animal.charAt(1)+""+phoneNum.charAt(3)+"";
        
        //convert to uppercase
        password=password.toLowerCase();
        
        
        System.out.println("\nYour user id is "+userID);
        
        System.out.println("\nYour password is "+ password);
        
        String userID1=in.nextLine();
        
        String password1=in.nextLine();
        do{
        
        System.out.println("\nNow enter user id ");
        userID1=in.nextLine();
        
        System.out.println("\nAnd enter password ");
        password1=in.nextLine();
        
        if (userID1.equalsIgnoreCase(userID)&&password1.equalsIgnoreCase(password))
            
        {
            System.out.println("\nAccess Granted");
            
        }    
        
        
        else {
            
            
            System.out.println("\nAccess Denied");
        }
        
        }while(userID1!=userID&&password1!=password);
    }
}
