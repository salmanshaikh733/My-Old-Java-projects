// opens package bankaccounts
package bankaccounts;

/**
 * bank accounts 
 * February 6th 2015
 * @author mshaikh0798
 */

// import text library for decimal formatting .
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BankAccounts {

    //class main method
    public static void main(String[] args) {
        
        //declare and contruct a decimal format object called money
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        
        JOptionPane.showMessageDialog(null,"The following program will ask for your Savings and cheqing information");
        
           double chqAcct = Double.parseDouble(JOptionPane.showInputDialog("Please enter your cheqing information"));   
        
           double savAcct = Double.parseDouble(JOptionPane.showInputDialog("Please enter your savings information"));
        
           double totalAmount = chqAcct + savAcct;
        
        //declare strings variables 
        /**String totalV = "\nTotal amount in bank account\t";

        String savA = "\nAmount in Saving account\t";

        String chqA = "\nAmount in cheqing account\t";

        String Title = "\t*** Bank account balance***";*/

        //system output to output window 
       JOptionPane.showMessageDialog(null,"\t***Bank account balance***");
       
       //JOptionPane.showMessageDialog(null, "Amount in cheqing account" +"\t\n" +money.format(chqAcct));
       //if statemetns 
       
       
       //JOptionPane.showMessageDialog(null, "Amount in savings account" + "\t\n"+money.format(savAcct));
       //if statemetns 
      if (savAcct <= 10 && chqAcct <= 10)
       {
           JOptionPane.showMessageDialog(null, "Both account balances are dagerously low");
           
       } 
      else if (savAcct <= 10)
        {
            
            JOptionPane.showMessageDialog(null,"***Savings account balance is low***");
        }
       
       
       
      else if (chqAcct <= 10)
        {
            
            JOptionPane.showMessageDialog(null,"***Cheqing account balance is low***");
                        
        } // end of output      

        JOptionPane.showMessageDialog(null, "Total amount in account" + "\t\n"+money.format(totalAmount));
       
        
        
    }// cloeses main method
    
}// closes class
