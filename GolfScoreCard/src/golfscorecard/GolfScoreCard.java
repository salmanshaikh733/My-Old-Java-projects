
package golfscorecard;

/**
 *
 * @author mshaikh0798
 */

import java.util.*;

public class GolfScoreCard {
    

   
    public static void main(String[] args) {
      int total=0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("***Golf score card***");
        
         int beatles[]=new int[5];      
        
     for (int i=0;i<beatles.length;i++)
     {
     //assign the individual elements with names
        System.out.print("\nEnter your score for hole number "+(i+1)+":");
     
     beatles[i]=in.nextInt();
  
    
     
     }
       
      
      for (int i=0;i<beatles.length;i++)
      {
          System.out.println("\nHole " + (i+1)+ "-" + beatles[i]);
          
          total+=beatles[i];
          
      }
          System.out.println("\nThe toatl is "+total);
    }
        
        
    }


