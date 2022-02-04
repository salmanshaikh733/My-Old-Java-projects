
package salary;

/**
 *
 * @author mshaikh0798
 */

//import java librareis
import java.util.*;

public class Salary {

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        
        System.out.println("Enter your hourly rate of pay");
        double ratePay=in.nextDouble();
        
        System.out.println("Enter your hours regular hours");
        double rhours = in.nextDouble();
        
        System.out.println("Enter your overtime hours");
        double overHours = in.nextDouble();
        
        double salary=calcpay(ratePay,rhours,overHours);
        
        System.out.println("Your pay is $"+Math.round(salary));
        
    }
    
    public static double calcpay(double n, double w, double r )
            
    {
 
           return (n*w)+r*1.5*n;
            
    }
        
         
         
    }
    

