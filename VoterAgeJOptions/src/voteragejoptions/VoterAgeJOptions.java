
package voteragejoptions;

/**Voter Age jOptions
 *February 23rd 2015
 * @author mshaikh0798
 */

// import jOptions
import javax.swing.JOptionPane; 

public class VoterAgeJOptions {
    
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"The following program will ask your for your age to determine weather you are eligble to vote.");
        
        int userAge = JOptionPane.showConfirmDialog(null,"Are you over 18","Voter AGE ELIGIBILITY",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               
        // confirm dialog box      
        int origin = JOptionPane.showConfirmDialog(null,"Are you canadien?","VOTER AGE",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        // if statements
        
        if (userAge == (JOptionPane.YES_OPTION) && (origin == (JOptionPane.YES_OPTION)))
        {
            
            JOptionPane.showMessageDialog(null,"You can vote, you are over 18 and canadien","VOTER AGE",JOptionPane.PLAIN_MESSAGE);
            
        }
        
        else if (userAge == (JOptionPane.NO_OPTION) && (origin == (JOptionPane.NO_OPTION))) 
        {
            JOptionPane.showMessageDialog(null,"You can't vote, you are not canadien and below the age of 18","VOTER AGE",JOptionPane.ERROR_MESSAGE);
             
        }
        
        else if (userAge == (JOptionPane.YES_OPTION) && (origin == (JOptionPane.NO_OPTION)))
        
        {
          JOptionPane.showMessageDialog(null," You are over the age of 18, but you're not candien you can't vote","VOTER AGE",JOptionPane.ERROR_MESSAGE);  
            
        }
            
        else if (userAge == (JOptionPane.NO_OPTION) && (origin == (JOptionPane.YES_OPTION)))
        
        {
          JOptionPane.showMessageDialog(null," You are not over the age of 18, but you are candien you can't vote","VOTER AGE",JOptionPane.ERROR_MESSAGE);  
            
        }
            
        else 
        {
           JOptionPane.showMessageDialog(null,"YOU CANNOT VOTE YOU DO NOT MEET ANY OF THE REEQUIREMENTS","VOTER AGE",JOptionPane.ERROR_MESSAGE); 
            
        }
    }
}
