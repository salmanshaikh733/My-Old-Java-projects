
package currencyconverter;

/**
 *
 * @author mshaikh0798
 */

//import java libraries 
import java.util.*;

public class CurrencyConverter {

    
    public static void main(String[] args) {
        
        //delcare scanner 
        Scanner in = new Scanner(System.in);
        
        // ask for user input
        System.out.print("\nEnter an amount of money in Canadien Dollars: ");
        double canadienMoney = in.nextDouble();
        
        //call method and store into a variable
        double money=currencyConverter(canadienMoney);
        
        //output the final answer 
        System.out.println("\n$"+Math.round(canadienMoney)+" in US currency is $"+ Math.round(money));
    }
    
    //declare currency converter method
    public static double currencyConverter(double n)
    {
        return(n*0.83);
        
    }// end of currencyConverter method
    
    
}
