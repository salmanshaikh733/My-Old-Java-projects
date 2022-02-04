
package pkg3letteracronym;

/**
 *
 * @author mshaikh0798
 */

//import scanner 
import java.util.*;


public class Main {

    public static void main(String[] args) {
     
     //decalre and assign scanner   
     Scanner in = new Scanner(System.in);
     
     
         
        // ask for user input
        System.out.println("\nPlease enter a 3 letter word;");
        String word=in.nextLine();
             
        String firstInitial=word.charAt(0)+"";
        
        String secondInitial=""+word.charAt(word.indexOf(" ")+1);
        
        String thirdInitial=""+word.charAt(word.lastIndexOf(" ")+1);
        
        String acronym= (firstInitial+secondInitial+thirdInitial).toUpperCase();
        for (int i=0;i<=10;i++)
     {
        //output three letter word as acronym
        System.out.println("\nThe three letter acronym of "+ word+ " is " + acronym);
     }
      
    }
}
