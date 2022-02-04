
package heightandweightconverter;

/**height and weight converter
 *May 14th 2015
 * @author mshaikh0798
 */

//import java libraries 
import java.util.*;

//public class
public class HeightandWeightconverter {

    //main method
    public static void main(String[] args) {
        
        //declare scanner 
        Scanner in = new Scanner(System.in);
        //program intro
        System.out.println("\t***Imperial to Metric Converter***");
        
        // ask for weight in pounds
        System.out.println("\nEnter your weight in pounds: ");
        double weight=in.nextDouble();
        
        // ask for height in feet and inches
        System.out.println("\nEnter your height in feet and inches");
        System.out.println("\nPress ENTER after entering feet");
        double height = in.nextDouble();
        
        double heightInch =in.nextDouble();
        
        //call the weightConverter Method
        double weightKG=weightConverter(weight);
        
        //call the heightConverter Method
        double heightCM = heightConverter(height,heightInch);
        
        //output the final answer 
        System.out.println("\nYou weigh "+ Math.round(weightKG)+" kg and are "+Math.round(heightCM)+" cm tall.");
        
    }// end of main method
    
    // define the weightConverter method
    public static double weightConverter(double n)
    {
        
        return(n*0.454);
        
    }// end of weightConverter method
    
    // define the heightConverter method
    public static double heightConverter(double n, double w)
            
    {
        
        return(n*30.492+(w*2.541));
        
        
    }// end of heightConverter Method
    
}// end of public class
