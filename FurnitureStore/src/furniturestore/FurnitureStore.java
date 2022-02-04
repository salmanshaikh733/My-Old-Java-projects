
package furniturestore;

/**Furniture Store 
 *February 24th 2015
 * @author mshaikh0798
 */

//import jOptions
import javax.swing.JOptionPane; 
import java.text.*;

public class FurnitureStore {

    
    public static void main(String[] args) {
        // declare decimal formatting
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        
        //JOption pane output
        JOptionPane.showMessageDialog(null,"The following program will ask you for 3 tables Pine, Oak, or Mahogany, anything else is invalid","Furniture Comapny",JOptionPane.INFORMATION_MESSAGE);
        
        // output message         
        String tableType = JOptionPane.showInputDialog(null," Please enter the type of table you want","Furniture Company",JOptionPane.QUESTION_MESSAGE);
        
        //varibales used for assignments
        int Pine = 100; 
        
        int Oak = 225;
        
        int Mahogany = 310;
        
        //conditional assignment varibales 
        String woodType = "AN INVALID CHOICE";
        
        double woodPrice = 0;
        
        // start of if staemetns to assign varibles for output
        if ("Pine".equals(tableType))
            
        {
            woodType="Pine";
            woodPrice = Pine;
                       
        }
        
        else if ("Oak".equals(tableType))
        {
            woodType="Oak";
            woodPrice= Oak;
            
        }
            
        else if ("Mahogany".equals(tableType))
        {
            woodType = "Mahogany";
            woodPrice = Mahogany;
            
        }               
        // end of if statements
                             
        // beginning of output
        JOptionPane.showMessageDialog(null," You have chosen " + woodType + " Your cost associated with the choice is "+  money.format(woodPrice),"Furniture Company",JOptionPane.INFORMATION_MESSAGE);
        
        // end of output                
        
    }// end of main method
    
    
     
    
    
}

