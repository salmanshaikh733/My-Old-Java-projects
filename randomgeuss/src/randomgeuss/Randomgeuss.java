
package randomgeuss;

/**random geuss
 *March/30/2015
 * @author mshaikh0798
 */

//import jOptions 
import javax.swing.*;

public class Randomgeuss {

    
    public static void main(String[] args) {
        
        // into message to program
       JOptionPane.showMessageDialog(null,"\tWelcome to Random Number. \n\tA random number will be generated you have to geuss which one","Random Number",JOptionPane.INFORMATION_MESSAGE);
        
        //declare and assign variables  
        int userInput =0;
        
        int randomNum = (int)(Math.random()*10+1);
        
        int attempts=10;
        
        //declare do while loop
        do{
            
        // subtract attemps by 1 everytime it runs    
        attempts--;
        
        //output the randomNum to dev console
        System.out.println(randomNum);
        
        //Intro Message
        userInput =Integer.parseInt(JOptionPane.showInputDialog(null,"GEUSS A NUMBER BETWEEN 1 and 10 Inclusive","Random Number",JOptionPane.PLAIN_MESSAGE));
    
       
       // if statments for determining weather number is correct or greater or lower
       if (userInput>randomNum)
       {
           JOptionPane.showMessageDialog(null,"Too High","Random Number",JOptionPane.WARNING_MESSAGE);
           JOptionPane.showConfirmDialog(null, "Would you like to try again"+" you have "+ attempts+" attempts remaining","Random Number",JOptionPane.YES_NO_OPTION);
       }
        
       else if (userInput<randomNum)
       {
           JOptionPane.showMessageDialog(null,"Too Low","Random Number",JOptionPane.WARNING_MESSAGE);
           JOptionPane.showConfirmDialog(null, "Would you like to try again"+" you have "+ attempts+" attempts remaining","Random Number",JOptionPane.YES_NO_OPTION);
       }
       
       else if (userInput==randomNum)

       {
          JOptionPane.showMessageDialog(null,"Correct, it took you "+attempts+" attempt(s)","Random Number",JOptionPane.INFORMATION_MESSAGE);
           
       }// end of if statments 
                  
        }while(randomNum!=userInput&&(attempts!=0));// end of loop
        
        // last message for when user runs out of attemtps
        if (randomNum!=userInput)
        {
          JOptionPane.showMessageDialog(null,"Looks like you ran out of attempts, the correct answer was "+randomNum);
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"YOU WON!!");
        }
       
    }// end of main method
}// end of public class
    

