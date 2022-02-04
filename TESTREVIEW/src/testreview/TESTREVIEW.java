// beginning of program!!
package testreview;

/**February 17th 2015
 *test Review
 * @author mshaikh0798
 */

//import java classes 
import java.text.DecimalFormat; 
import java.util.Scanner;

public class TESTREVIEW {
    
    // main function 
    public static void main(String[] args) {
        
        //delcare and assing varibales for decimal formatting and user input
        Scanner in = new Scanner(System.in);
        DecimalFormat CelTemp = new DecimalFormat("##°C"); 
        DecimalFormat ferTemp = new DecimalFormat("##°F");
       
        System.out.println("Enter tempreature in celsius:");
        double celTemp = in.nextDouble();
        
        //declare variable for calculating teampreature 
        double farenheit = celTemp*2+30;
        
        //output temperature in farenheit and celsius
        System.out.println("\nTHE TEMPERATURE IN CELSIUS: " + CelTemp.format(celTemp));
        System.out.println("\nTHE TEMPERATURE IN FARENHEIT IS: " + ferTemp.format(farenheit));
                                   
    }// end of main method
    
}// end of public class
