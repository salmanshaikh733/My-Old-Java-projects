
package repeittion.hands.on.pkg2;

/**Repetition Hands 2
 *April 14 2015
 * @author mshaikh0798
 */

public class RepeittionHandsOn2 {

    
    public static void main(String[] args) {
        
        //output intro message
        System.out.println("\t***Declining Enrollment***");
        
        // add space between title and year and population output
        System.out.println("\n");
        
        // dclare and assign population
        double population=1600;
        
        //declare and assing year
        int year =2012;
       
        //declare and assingn while loop
        while(population>607)
            
        {
            //decrease population by 2%
            population*=0.98;
            
            //increase year by 1
            year++;
            
            //output year and population
            System.out.println("In the year "+ year+", the population will be "+Math.round(population)+".");
          
        }// end of while loop
        
        System.out.println("\nThe school will close in the year "+year);
        
    }// end of main method
    
}// end of public class
