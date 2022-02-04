
package userinputcointoss;

/**Coin Toss userInput
 *April 9th 2015
 * @author mshaikh0798
 */

//import java classes
import java.util.*;

public class UserInputCoinToss {
    
    public static void main(String[] args) {
        
        // declare Scanner 
        Scanner in = new Scanner(System.in);
        
        // ask for userInput
        System.out.println("How Many times would like to filp the coin");
        int userNum= in.nextInt();
        
        //declare and assingn variable
        double randomNum = 0;
        
        double heads=0;
        
        double tails=0;
        
        double headsp=0;
        
        double tailsp=0;
        
        // declare for loop
        for (int i =1 ; i<=userNum; i++)
    {
        
        // assign random number method
        randomNum = Math.random();
        //System.out.println(randomNum);
        
        //declare if statment
        if (randomNum<=0.5)
            
        {     
            heads++; // increases number of heads
        }
        
        else 
        {
            tails++; // increases number of tails 
        }// end of if statment 
      
        
     }// end of for loop
        
        //outout number of heads and tails
        System.out.println("\nNumber of heads " +heads+" Number of tails "+tails);
        
        // calculate for percentage of heads of tails
        headsp=(double)heads/userNum*100;
       
        tailsp=(double)tails/userNum*100;
       
        
//        double roundH = Math.round(headsp/100);
//        double roundT = Math.round(tailsp/100);
        
        // output percentage
        System.out.println("\nNumber of heads " +Math.round(headsp)+"%" +" Number of tails "+Math.round(tailsp)+"%");
    }
}
