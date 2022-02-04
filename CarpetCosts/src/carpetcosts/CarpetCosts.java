
package carpetcosts;

/**carpet cost
 *February 12th 2015
 * @author mshaikh0798
 */

//import java classes 
import java.util.Scanner;
import java.text.DecimalFormat;

public class CarpetCosts {
    
    public static void main(String[] args) {
        //declare java classes
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        DecimalFormat area = new DecimalFormat("###ft.00²");
        Scanner in = new Scanner(System.in);
        
        //delcare and assing variables.
        System.out.println("Enter the width of your flooring in feet.");
        double userWidth = in.nextDouble();
        
        System.out.println("\nEnter the length of your flooring in feet.");
        double userLength = in.nextDouble();
        
        System.out.println("\nEnter the carperting per square foot.");
        double carpetPerFoot = in.nextDouble();
        
        // variables used for calculating 
        double userArea = (userWidth*userLength);
        
        double totalCost = (carpetPerFoot*userArea);
        
        //output data 
        System.out.println("\n\tThe Total area of the room is "+area.format(userArea));
        
        System.out.println("\tThe total cost to carpet this area is " +  money.format(totalCost));
        System.out.println("");
        
    }
}
