//opens package obtian user input
package obtain.user.input;

/**obtain user input
 *Febuary 9th 2015
 * @author mshaikh0798
 */

// import jave class
import java.text.DecimalFormat;
import java.util.Scanner;

public class OBTAINUSERINPUt {
   
    // main method
    public static void main(String[] args) {
    
    //delcare decimal point variable 
    DecimalFormat money = new DecimalFormat("$#,##0.00");  
    
    //declare and contruct a scanner
    Scanner in = new Scanner(System.in);
              
    // declare and assing varibles
    
    System.out.println("Enter your name");    
    String yourName = in.nextLine();
    
    System.out.println("Enter your age");
    int yourAge = in.nextInt();
    
    System.out.println("Enter your bank balance no dollar sign *$*");
    double yourBankBalance = in.nextDouble(); 
    // end of declaring and assinging varibles

    
    //system output
    System.out.println("My name is " +yourName);
    
    System.out.println("I am "+yourAge+" years old");
    
    System.out.println("I have " +money.format(yourBankBalance)+", In my wallet" );
                     
    }// end of main method
}
