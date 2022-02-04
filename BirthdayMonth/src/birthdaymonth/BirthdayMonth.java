
package birthdaymonth;

/**
 *
 * @author mshaikh0798
 */

// import java libraries
import java.util.*;

public class BirthdayMonth {

    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter the number of the month you were born in");
        int monthNumber =in.nextInt();
        
       
        String Month=month(monthNumber);
        
        System.out.println("\nYou were born in "+Month);
    }
    
    
    public static String month(int month)
     {           
        if (month==1)
        {
            
            return ("January");
        }
        
        else if (month==2)
        {
            
           return("Feb");
        }
        
        else if (month==3)
        {
            return("March");
           
        }
        
        else if (month==4)
        {
            return("April");
          
        }
        
        else if (month==5)
        {
            return("May");
            
        }
        
        
        else if (month==6)
        {
            return("June");
            
        }
        
        
        else if (month==7)
        {
            return("July");
            
        }
        
        else if (month==8)
        {
            return("August");
           
        }
        
        else if (month==9)
        {
            return("September");
            
        }
        
        else if (month==10)
        {
            return("October");
           
        }
        
        else if (month==11)
        {
            
           return("November");
        }
        
        else  
        {
            return("December");
            
        }
                
        
    } // end of month statment


    
}
