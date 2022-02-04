
package hstcalc;

/**hstCALC
 *Febuary 11th 2015 
 * @author mshaikh0798
 */
//import text and uitl library 
import java.text.DecimalFormat;
import java.util.Scanner;
public class HSTCALC {

    // open main method 
    public static void main(String[] args) {
        //declare and assing varibles
        DecimalFormat money  = new DecimalFormat("$#,##0.00");
        Scanner in = new Scanner(System.in);
        
        System.out.println("please enter the name of the item");
        String itemName = in.nextLine();
        
        System.out.println("Enter the cost of the item");
        double itemCost = in.nextDouble();
        
        double tax = 0.13*itemCost;
        
        double total = tax+itemCost;
        
        //output to console 
        System.out.println("\tThe tax on the item is "+money.format(tax));
        
        System.out.println("\n\tThe total amount is "+money.format(total));
        
        System.out.println("\n Enjoy your " + itemName+"!!!!!");
    }//closes main method 
}//closes hst class
