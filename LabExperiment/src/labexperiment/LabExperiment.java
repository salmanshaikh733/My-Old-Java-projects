
package labexperiment;

/**
 *
 * @author mshaikh0798
 */

import java.text.*;

public class LabExperiment {

    
    public static void main(String[] args) {
            
     int animals=10;
     int food = 1000;
     int hours =0;
     
     System.out.println("\nHour "+hours+" : "+animals+" Animals "+food+ " Units of Food.");
     
     do
     {
     // start calculations
     
     //increase hours    
     hours++;
     // double the animal population
     animals*=2;
     // subtract food from population
     food -=animals;
     // add 4000 units of food
     food +=4000;   
         // output 
         System.out.println("\nHour "+hours+" : "+animals+" Animals "+food+ " Units of Food.");
         
     }  while (animals<=food);
        
        System.out.println("\nPOPULATION HAS EXCEEDED THE FOOD SUPPLY!!"); 
        
        
    }
}
