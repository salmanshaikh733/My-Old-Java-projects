package salestaxcalculator;

/**sales tax calculator
 * June 24th 2015
 * @author mshaikh0798
 */

//import java libraries
import java.text.*;
import java.util.*;

public class SalesTaxCalculator {

    public static void main(String[] args) {

        //declare and assign decimal format and scanner
        DecimalFormat money =new DecimalFormat("$###.00");
        Scanner in = new Scanner(System.in);

        //declare and assign variables to be used in tghe program
        String item = null;

        double costItem = 0;
        
        String statusCard = null;
        
        double salestax = 0;

        double totalCost = 0;
        
        // program intro
        System.out.println("\t*** Sales Tax Calculator***");
        
        //ask for item name
        System.out.println("\nEnter the name of an item");
        item = in.nextLine();

        //ask for item cost
        System.out.println("\nEnter the cost of the item");
        costItem = in.nextDouble();
        in.nextLine();
        
        //ask if user is native or not
        System.out.println("\nDo you have a native status card?");
        statusCard = in.nextLine();
        
        
        //if user is not native then output with tax calculated
        if (statusCard.equalsIgnoreCase("no")) {
            
            salestax=calcTax(costItem);
            
            totalCost=salestax+costItem;
            
            System.out.println("\n\t"+item +"\t        "+ money.format(costItem));
            
            System.out.println("\n\t"+"Sales Tax\t" + money.format(salestax));
            
            System.out.println("\n\t"+"Total Cost\t" + money.format(totalCost));
        } 
        
        //if yes output only name and cost
        else 
        {
            System.out.println("\n\t"+item);
            System.out.println("\n\tTotal Cost "+money.format(costItem));
        }
        
    }//eend of main metjhod

    //method to calculate the tax
    public static double calcTax(double i) 
    {
        
        return i*0.13;
        
    }
}//end of program

