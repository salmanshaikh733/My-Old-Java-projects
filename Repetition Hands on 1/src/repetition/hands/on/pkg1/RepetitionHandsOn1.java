
package repetition.hands.on.pkg1;

/**Repetition Hands on 1
 *April/14th/2015
 * @author mshaikh0798
 */


public class RepetitionHandsOn1 {

    
    public static void main(String[] args) {
        
        //output message to program
        System.out.println("\t***Metric to Imperial Conversions***");
        
        System.out.println("\n");
         
        //declare and assign varibles
        double pounds=0;
        
        //declare for loop
        for (int i =5 ; i<=50; i+=5)
        {
            // convert kilo to pounds
            pounds = i*2.2;
            
            //output kilograms to pounds
            System.out.println(i+" Kilograms is equvalant to " + Math.round(pounds)+" pounds.");
            
            
        }// end of for loop
        
        
        
    }// end of main method
    
}// end of public class
