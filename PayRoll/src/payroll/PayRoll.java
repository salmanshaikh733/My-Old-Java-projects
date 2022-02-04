
package payroll;

/**Pay Roll
 *Febuary 12th 20215
 * @author mshaikh0798
 */

   //import java classes 
   import java.text.DecimalFormat;
   import java.util.Scanner;

public class PayRoll {

    public static void main(String[] args) {
        //declare java classes
        Scanner in = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        
        //delcare java variables for user input
        System.out.println("Please enter the number of hours worked.");
        double userHourRate = in.nextDouble();
                
        System.out.println("\nPlease enter the hourly rate of pay.");
        double numHour = in.nextDouble();
        
        //declare java varibales for calculating purposes
        double grossPay = userHourRate*numHour;
        
        double deductions = grossPay*0.23;
        
        double netpay = grossPay-deductions;
        
        //output data 
        System.out.println("\nYour Gross pay is "+ "\n"+money.format(grossPay));
        
        System.out.println("\nYour deductions are " + "\n"+money.format(deductions));
        
        System.out.println("\nYour net pay is " + "\n"+money.format(netpay));
        
    }//end of program
}
