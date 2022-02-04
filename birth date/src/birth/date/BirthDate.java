
package birth.date;

/**Birth Date
 *March 12th 2015
 * @author mshaikh0798
 */

//import util libraries 
import java.util.*;


public class BirthDate {
   
    public static void main(String[] args) {
        
     //declare scanner    
     Scanner in = new Scanner(System.in);
         
        // main title 
        System.out.println("\t *** SHORT DATE CALCULATOR ***");
        
        // ask for user input
        System.out.print("\nEnter the name of the month you were born: ");
        String month = in.nextLine();
        
        System.out.print("\nEnter the day you were born: ");
        int day = in.nextInt();
        
        System.out.print("\nEnter the year you were born: ");
        int year = in.nextInt();
        
        //create varibale for month conversion
        int monthNumber =0; 
        
        String output = "\nYou were born on ";
        
        // if statements for invalid entry
        if (day < 1 || day > 31 || year < 1900 || year > 2015)
        {
            output = "\nERROR INVALID ENTRY ";
            year = 0;
            day = 0;
            monthNumber =0;
            
        }
        
        //statements for converting months to number
        else if (month.equals("September"))
        {
            
            monthNumber = 9;
        }
        
        else if (month.equals("October"))
        {
            
            monthNumber =10;
        }
        
        else if (month.equals("November"))
        {
            
            monthNumber=11;
        }
        
        else if (month.equals("December"))
        {
            
            monthNumber =12;
        }
        
        else if (month.equals("January"))
        {
            
            monthNumber =1;
        }
        
        
        else if (month.equals("February"))
        {
            
            monthNumber =2;
        }
        
        
        else if (month.equals("March"))
        {
            
            monthNumber =3;
        }
        
        else if (month.equals("April"))
        {
            
            monthNumber =4;
        }
        
        else if (month.equals("May"))
        {
            
            monthNumber =5;
        }
        
        else if (month.equals("June"))
        {
            
            monthNumber =6;
        }
        
        else if (month.equals("July"))
        {
            
            monthNumber =7;
        }
        
        else if (month.equals("August"))
        {
            
            monthNumber =8;
        }
       // end of if statements  
        
        
        // output final 
        System.out.println(output+day+"/"+monthNumber+"/"+year+".");
        // end of output
        
    }// closes main method
    
    
    
}
