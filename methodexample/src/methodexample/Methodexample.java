
package methodexample;

/**Method Example
 *May 6th 2015
 * @author mshaikh0798
 */

import java.util.*;

public class Methodexample {
    
//declare variables globally    
//public static double num1,num2,total;


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number");
        double num1=in.nextDouble();
          
        System.out.println("Enter another number");
        double num2=in.nextDouble();
        
        // call the addition method
        
        
        //output the answer
        System.out.println("\n"+Math.round(num1) + " + "+ Math.round(num2) +" = " + + Math.round(addition(num1,num2)));
        
    }// closes main method
    
    public static double addition(double n,double w) 
    {
    
        return (n + w);
       
    }//closes addition method
      
    }//end of public class
    

