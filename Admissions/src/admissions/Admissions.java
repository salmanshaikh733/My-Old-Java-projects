
package admissions;

/**Admissions
 *March 11th 2015
 * @author mshaikh0798
 */

import java.util.*;
import java.text.*;

public class Admissions {
 
    public static void main(String[] args) {
        
    //declare and assign scanner and decimal format    
    Scanner in = new Scanner(System.in);   
    DecimalFormat GPA = new DecimalFormat("#,##");    
        
    //declare and assign variables 
    System.out.println("PLESE ENTER YOUR GPA");
    double gPA = in.nextDouble();
    
   System.out.println("PLESE ENTER YOUR ADMISSION TEST SCORE");
   double adMISSION = in.nextInt();
   
   if (gPA < 0 || gPA > 4.0 || adMISSION < 0 || adMISSION > 100)
       
   {
       System.out.println("ERROR VALUE ENTRED IS NOT CORRECT");
       
   }
   
   else if (gPA >= 3.0 || adMISSION >= 60)
   {
       System.out.println("ACCEPT");
       
   }
    
   else if (gPA <= 3.0 && adMISSION >= 80 )
   {
       System.out.println("ACCEPT");
       
   }
       
   else 
   {
       System.out.println(" REJETED, YOUR A FAILURE HAHAHAHAH");    
       
   }
   
    }
}
