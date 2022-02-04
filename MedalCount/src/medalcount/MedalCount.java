
package medalcount;

/**medalCount
 *February 10th 2015
 * @author mshaikh0798
 */

import java.util.Scanner;


public class MedalCount {

    
    
    public static void main(String[] args) {
        
        //declare sanner variables 
        Scanner in = new Scanner(System.in);
        
        //declare and assign variables
        System.out.println("Enter the name of your country;");
        String Country = in.nextLine();
        
        System.out.println("Enter the number of Gold, Silver, and Bronze Medals(PRESS ENTER AFTER EACH)");
        int gMedal = in.nextInt();
        int SMedal = in.nextInt();
        int bMedal = in.nextInt();
        //delcare total variable
        int Total =  (gMedal+SMedal+bMedal);//sdhfjklasdhfjkasdhjkf
        
        //output data in chart form
        System.out.println("\t***Medal Count for " + Country+"***");    
        
        System.out.println("\nGold" +"\t\tSilver" + "\t\tBronze" + "\t\tTotal");
        
        System.out.println("\n" + gMedal + "\t\t"+ SMedal + "\t\t"+bMedal+ "\t\t"+Total);
        
        
    }//closes main method
}// closes class
