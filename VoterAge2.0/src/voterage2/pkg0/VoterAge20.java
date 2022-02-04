

package voterage2.pkg0;

/**VOTER AGE 2.0
 *February 26th 2015
 * @author mshaikh0798
 */

import javax.swing.JOptionPane;
public class VoterAge20 {
    
    public static void main(String[] args) {
        
        int voteAge=JOptionPane.showConfirmDialog(null,"Are you 18 or older??","CourseSurvey",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        int origin = JOptionPane.showConfirmDialog(null,"Are you canadien?");
        
        if (voteAge == (JOptionPane.YES_OPTION) && (origin == (JOptionPane.YES_OPTION)))
        {
            
            JOptionPane.showMessageDialog(null,"You can vote");
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"You can't vote");
             
        }
                                                                                        

    }
}
