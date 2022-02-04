
package zodiaccalculator;

/**Zodiac Calculator
 *May 13 2015
 * @author mshaikh0798
 */

// import java libraries
import java.util.*;

public class ZodiacCalculator {

    // declare day as public 
   public static int day;
    
    public static void main(String[] args) {
        
        //declare scanner 
        Scanner in = new Scanner(System.in);
         System.out.println("*** Zodiac Sign Calculator ***");                 
         
        // ask for the number of month
        System.out.print("\nEnter a month number: ");
        int monthNumber =in.nextInt();
        
        // enter the day of the month
        System.out.print("\nEnter the month date: ");
        int date = in.nextInt();
        
        //call the Monthmethod
       String Month=month(monthNumber);
        
       // call the dayYearmethod
       day = dayYear(date,monthNumber);
       
       // call the zod method
       String zod =Zodiac(day);
       
       // output the final answer
        System.out.println("\n"+Month+" falls under the sign of "+zod);
        
    }// end of main method
    
    // create Monthmethod to determine month
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
                
        
    }// end of month method
     
     // create dayYear method to determine day in year
     
     public static int dayYear(int day, int month)
     {
                 
         if (month==1)
         {
             return(day);
         }
         else if (month==2)
         {
             return(day+31);
             
         }
         
         else if (month==3)
         {
             
             return(day+60);
         }
              
         else if (month==4)
         {
             
             return(day+91);
         }
         
         else if (month==5)
         {
             
             return(day+121);
         }
         
         else if (month==6)
         {
             return(day+152);
             
         }
         
         else if (month==7)
         {
             return(day+182);
             
         }
         
         else if (month==8)
         {
             
             return(day+213);
         }
         
         else if (month==9)
         {
             
             return(day+244);
         }
         
         else if (month==10)
         {
             
             return(day+274);
         }
         
         else if (month==11)
         {
             return(day+305);
             
         }
         
         else 
         {
             
             return(day+335);
         }
         
     }// end of day year method
     
     
     //create Zodiac method
    public static String Zodiac(int n)
            
    {
       if (day>=20 && day<=50)
       {
           return("Aqarious");
       }
       
       else if (day>=51&&day<=79)
       {
           
           return("Pisces");
       }
        
       else if (day>=80&&day<=110)
       {
           
           return("Aries");
       }
    
       else if (day>=111&&day<=140)
       {
           
           return("Taurus");
       }
       
       else if (day>=141&&day<=171)
       {
           return("Gemini");
       }
           
       else if (day>=172&&day<=203)
           
       {
           
           return("cancer");
       }
       
       else if (day>=204&&day<=234)
           
       {
           
           return("Leo");
       }
       
       else if (day>=235&&day<=265)
       {
           
           return("Virgo");
       }
       
       else if (day>=266&&day<=295)
           
       {
           
           return("Libya");
       }
       
       
       else if (day>=296&&day<=326)
       {
           
           return("Scorpio");
       }
       
       else if (day>=327&&day<=355)
       {
           
           return("Sagistarius");
       }
       
       else 
       {
           
           return("capricorn");
       }
}// end of zod method
    
}// end of public class