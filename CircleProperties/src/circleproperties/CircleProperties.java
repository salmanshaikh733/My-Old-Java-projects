
package circleproperties;

/**
 *
 * @author mshaikh0798
 */

import java.util.*;

public class CircleProperties {

    
    public static void main(String[] args) {
        
          Scanner in = new Scanner(System.in);
          
          System.out.println("Enter what you want to find the perimeter of circle,Square,rectangle, or triangle");
          String input=in.nextLine();
          
          
          if(input.equals("Circle"))
          {
          System.out.println("\nEnter the radius of the circle");
          double rad =in.nextDouble();
          
          System.out.println("\nThe perimeter is "+ Math.round(Math.PI*rad*2));
          
          System.out.println("\nThe area is "+ Math.round(Math.pow(rad,2)*Math.PI));

          }
        
          else if(input.equals("Square"))
                  {
                      System.out.println("\nEnter a side length of the square ");
                      double length=in.nextDouble();
                      
                      
                      System.out.println("The area is "+Math.round(Math.pow(length,2)));
                      
                      System.out.println("The perimeter is "+Math.round(length*4));
                      
                      
                  }
          
          else if (input.equals("Triangle"))
          {
              System.out.println("\nIs the triangle equalateral, isoceles, or scalene");
              String triangleType=null;
              
              System.out.println("\nEnter the base of the triangle");
              double base = in.nextDouble();
              
              System.out.println("\nEnter the height of the triangle ");
              double height =in.nextDouble();
              
              double area =base*height/2;
              
              if(triangleType.equals("Isoceles"))
              {  
              
              double hypotneuse = Math.sqrt(Math.pow(base/2,2)+Math.pow(height,2));
              
              double perimeter = base+hypotneuse+hypotneuse;
              
              
              //System.out.println("\nThe area is "+Math.round(area));
              
              //System.out.println("\nThe perimter is "+Math.round(perimeter));
              }
              
              else if (triangleType.equals("Equlateral"))
                  
              {
                  
                  double perimeter=base*3;
                  
                  //System.out.println("The area is "+Math.round(area));
                  
                  //System.out.println("The perimter is "+Math.round(perimeter));
                  
                  
              }
                 
              else if (triangleType.equals("Scalene"))
              {
                  System.out.println("What is the length of the third side");
                  double side3 = in.nextDouble();
                 
                  double hypotneuse= Math.sqrt(Math.pow(base/2,2)+Math.pow(height,2));
                  
                  double perimeter =side3+base+hypotneuse;
                  
                  //System.out.println("The area is "+Math.round(area));
                  
                  //System.out.println("The perimeter is"+Math.round(perimeter));
                  
                 
              }
              
              else 
              {
                  System.out.println("Invalid Triangle type");
                  
              }
              
          }
          
          
          else if (input.equals("Rectangle"))
          {
              System.out.println("Enter the length");
              double length = in.nextDouble();
              
              System.out.println("Enter the width");
              double width =in.nextDouble();
              
              double area = length*width;
              
              double perimter =2*(length+width);
              
              
              
          }
        
        
          else {
              
              System.out.println("Invalid Entry");
          }
          
          
          
          
    }
}
