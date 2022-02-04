
package dicev2;

/**
 *
 * @author mshaikh0798
 */
import javax.swing.*;

public class DiceV2 {

    
    public static void main(String[] args) {
        
        // delcare double store the money
        double money = 100;
        
        // message dialog with the rules 
        JOptionPane.showMessageDialog(null, "\tRULES \nBet a amount and roll! \n-If you get a 7 your bet will double! \n-If you roll a 2 or 12 your bet will triple! \n-You will start off with a wager of $100","Dice Roll",JOptionPane.INFORMATION_MESSAGE);
        
        //variable to store users choice to keep playing
         int keepPlaying =0;
        
        do {
       //declare and assign varibale to store bet
        int die = (int)(Math.random()*6+1);
        
        int die2 = (int)(Math.random()*6+1);
        
        int total = die+die2;
        
        //output dice value
        System.out.println(total);
        
        // declare and assing varibales to store bet
        double bet = Double.parseDouble(JOptionPane.showInputDialog(null," Enter the amount you wish to bet","Dice Roll",JOptionPane.QUESTION_MESSAGE));
        
        //reduce user money by bet
        money-=bet;
        
        // selection sequence to see if the user is the winner
        
        if (total==2||total==12)
        {
            money+=(bet*3);
            JOptionPane.showMessageDialog(null, "Its a " + total + " You have tripled your bet!","Dice Roll",JOptionPane.INFORMATION_MESSAGE);
            
        }
       
        else if (total==7)
        {
            money+= (bet*2);
            JOptionPane.showMessageDialog(null, "Its a " + total + " You have doubled your bet!","Dice Roll",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else 
        {
           JOptionPane.showMessageDialog(null, "Its a " + total + " You have lost your bet!","Dice Roll",JOptionPane.INFORMATION_MESSAGE);
        }
        
        // if statement to keep on playing 
        if (money>0)
        {
            
        keepPlaying =JOptionPane.showConfirmDialog(null," You have $"+ money + " Would you like to continue playing?","Dice Roll",JOptionPane.YES_NO_OPTION);
        
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"Sorry you are out of money, Thanks for playing","Dice Roll",JOptionPane.INFORMATION_MESSAGE);
            
        }// end of if statment 
        
        }while(money>0 && keepPlaying==(JOptionPane.YES_OPTION)); // end of loop
        
        // end of game message
        if (keepPlaying==(JOptionPane.NO_OPTION))
            
        {
            JOptionPane.showMessageDialog(null," You have quit the game, Your final amount was $"+ money + "Thanks for playing.","Dice Roll",JOptionPane.INFORMATION_MESSAGE);
            
        }// end of game message condition
         
    }// closes main method
    
}// closes the class
