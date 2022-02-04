
package allowance;

/**
 *
 * @author mshaikh0798
 */
public class ALLOWANCE {

    
    public static void main(String[] args) {
        
        
        
        double output=0.01;
        int week = 1;

        do {
         //output the week and allowacnce 
         System.out.println("IN WEEK " + week + " my allowance will be "+ output);
         
         //calculations
         output *=2;
         week++;
            
        }while(output<40);   
        
        System.out.println("IN WEEK " + week + " my allowance will be "+ output);
        
        
    }
}
