
package cylinderproperties;

/**Cylinder Properties
 *April 30th 2015
 * @author mshaikh0798
 */

//import java Scanner 
import java.util.*;

public class CylinderProperties {

    
    public static void main(String[] args) {
       
     //declare and assing Scanner 
     Scanner in = new Scanner(System.in);
     
        // Intro Properties    
        System.out.println("\t***Cylinder Properties***");
        
        // ask for user input
        System.out.print("\nEnter the radius of the cylinder: ");
        double rad = in.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double h = in.nextDouble();
        
        // sqaure the radius
        double radSquared=Math.pow(rad,2);
        
        // calculate the volume
        double volume= Math.PI*radSquared*h;
        
        // calulate the surface area
        double SA = 2*Math.PI*radSquared + 2*Math.PI*rad*h;
        
        //output the volume and surface area
        System.out.println("Volume (cubed): "+ Math.round(volume));
        
        System.out.println("Surface Area (squared): " + Math.round(SA));
        
    }// end of main method
    
}// end of public class
