package wishlist;

/**
 *
 * @author mshaikh0798
 */
import java.util.*;

import java.text.*;
public class Wishlist {
    
public static DecimalFormat out = new DecimalFormat("###.##");

    public static void main(String[] args) {

        
        
        Scanner in = new Scanner(System.in);

        System.out.println("\t*** WISH LIST ***");

        String itemName[] = new String[5];

        double itemPrice[] = new double[5];

        double itemTotal[] = new double[5];

        for (int i = 0; i < itemName.length; i++) {

            System.out.println("\nEnter the item name ");
            itemName[i] = in.nextLine();

            System.out.println("\nEnter the the price for " + itemName[i] + ":");
            itemPrice[i] = in.nextDouble();
            in.nextLine();
            
            //calculate the tax
            itemTotal[i]=itemPrice[i]*=1.13;
            
            System.out.println("\nWith tax $"+out.format(itemPrice[i]));
            
           
           //calcualte the total
           
        }
         System.out.println("\nThe total cost of the items is " + out.format(totalArray(itemTotal)));
        
        
    }
   public static double totalArray(double[]A) 
   {
       int total = 0;

        for (int i = 0; i < A.length; i++) {
            total += A[i];

        }
        return (total);

       
   }


}
