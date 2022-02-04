// start of program 
package university.fees;

/**university fees
 *February 19th 2015
 * @author mshaikh0798
 */

//import java libraries 
import java.text.DecimalFormat;
import java.util.Scanner;

// public class "Univeristy Fees" 
public class UniversityFees {
  
    // main method
    public static void main(String[] args) {
        
        //declare Scanner and Decimal Formating 
        Scanner userInput = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("$#,###.##");
        DecimalFormat Course = new DecimalFormat("##");
        
        //declare and assign variables for user input
        System.out.println("Please enter the number of courses you are taking: ");
        double numCourse = userInput.nextDouble();
        
        System.out.println("\nPlease enter the amount of money spent on books: ");
        double amntBooks = userInput.nextDouble();
        
        //variables used for calculations
        double totalFees = (numCourse*670.67+amntBooks+65);
        
        //output totalFees to output window along with athletic fees
        System.out.println("\nThe total fees for a student taking " + Course.format(numCourse) + " courses and spending " + money.format(amntBooks) + " on books is " + money.format(totalFees)+".*");
               
        System.out.println("\n*includes a $65.00 atheletic fee.");
        
    }// end of main method
    
}// end of public class
