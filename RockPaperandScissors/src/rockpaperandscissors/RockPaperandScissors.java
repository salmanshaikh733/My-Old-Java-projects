
package rockpaperandscissors;

/**Rock Paper and Scissors
 *April 2nd 2015
 * @author mshaikh0798
 */

// import java 
import javax.swing.*;

public class RockPaperandScissors {

    
    public static void main(String[] args) {
       
        String userInput =null;
        
        int randomNum =0;
        
        int scoreP=0;
        
        int scoreC=0;
        
      
        //intro to program
        JOptionPane.showMessageDialog(null,"\tWELCOME TO ROCK PAPER AND SCISSORS");
        
        JOptionPane.showMessageDialog(null,"\tWin best 2 out of 3 times to the winner of the entire game!!");
        
         do{
        // declare and assign variables 
         randomNum = (int)(Math.random()*3+1);
     
          // ask for user input
         userInput = (JOptionPane.showInputDialog(null,"Enter Rock Paper of Scissors"));
         
      
          // if statments part 1
         if(userInput.equals("Rock")&&randomNum<=1)
         {
             
            JOptionPane.showMessageDialog(null,"You geussed rock, and computer geussed Rock, Its a tie!");
            
         }
         
         else  if (userInput.equals("Rock")&&randomNum==2)
             
         {
             scoreC++;
             JOptionPane.showMessageDialog(null,"You geussed Rock, Computer geussed paper, paper beats rock, You lose");
             
         }
         else  if (userInput.equals("Rock")&&randomNum==3)
             
         {
             scoreP++;
             JOptionPane.showMessageDialog(null,"You geussed Rock, Computer geussed Scissors, rock beats scissors, You win");
             
         }
         
         // if statmetns part 2
        else  if (userInput.equals("Paper")&&randomNum<=1)
             
         {
             scoreP++;
             JOptionPane.showMessageDialog(null,"You geussed Paper, Computer geussed Rock, paper beats rock, You Win");
             
         }
         
        else  if (userInput.equals("Paper")&&randomNum==2)
             
         {
             JOptionPane.showMessageDialog(null,"You geussed paper, Computer geussed paper, paper vs paper, Its a tie");
             
         }
         
         else  if (userInput.equals("Paper")&&randomNum==3)
             
         {
             scoreC++;
             JOptionPane.showMessageDialog(null,"You geussed paper, Computer geussed Scissors, Scissors beats paper, You lose");
             
         }
         
         // if statments part 3
         else  if (userInput.equals("Scissors")&&randomNum<=1)
             
         {
             scoreC++;
             JOptionPane.showMessageDialog(null,"You geussed Scissors, Computer geussed rock, rock beats Scissors, You lose");
             
         }
         
         else  if (userInput.equals("Scissors")&&randomNum==2)
             
         {
             scoreP++;
             JOptionPane.showMessageDialog(null,"You geussed Scissors, Computer geussed paper, Scissors beats paper, You Win!!");
             
         }
         
         else  if (userInput.equals("Scissors")&&randomNum==3)
             
         {
             JOptionPane.showMessageDialog(null,"You geussed Scissors, Computer geussed Scissors, Scissors vs Scissors, Its a tie");
             
         }// end of if statments 
         
         
       } while(userInput.equals("Rock") && randomNum<=1 || userInput.equals("Paper") && randomNum==2 || userInput.equals("Scissors") && randomNum==3 && scoreC!=2 || scoreP!=2);  //end of while loop

         if (scoreP==2)
         {
             JOptionPane.showMessageDialog(null,"You Win!!");
             
         }
         
         else {
             JOptionPane.showMessageDialog(null,"You Lose!!");
             
         }
    }
    
}
