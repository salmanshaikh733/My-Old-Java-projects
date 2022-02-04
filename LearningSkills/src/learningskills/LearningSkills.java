
package learningskills;

/**Learning Skills
 *February 25th 2015
 * @author mshaikh0798
 */

import javax.swing.JOptionPane;
import java.text.*;

public class LearningSkills {
    
    public static void main(String[] args) {
        
        String Initial1 = JOptionPane.showInputDialog(null,"Please enter S,N,G,or E, anything else is invalid : PLEASE INPUT IN CAPITALS!");
        
        String Initial = null;
        
        String output="Your learning skills are ";
        
        if ("S".equals(Initial1))
        {
            Initial = "SATISFACTORY";
            
        }
        
        else if ("N".equals(Initial1))
        {
            
            Initial = "NEEDS IMPROVEMENT";
        }
        
        else if ("E".equals(Initial1))
        {
            Initial = "EXCELLENT";
            
        }
        
        else if ("G".equals(Initial1))
        {
            
            Initial = "GOOD";
        }
        
        else {
            
            output = "Please enter G,E,S, or N: ";
            Initial = "Please try again";
        }
        
        
        JOptionPane.showMessageDialog(null,output + Initial);
        
        
    }
     
}
