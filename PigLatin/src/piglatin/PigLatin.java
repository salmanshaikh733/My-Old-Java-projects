package piglatin;

/**pig latin
 *  June 24th 2015 *
 * @author mshaikh0798
 */

//import java lirbaries 
import java.util.*;

public class PigLatin {

    public static void main(String[] args) {

        //declare and assing scanner 
        Scanner in = new Scanner(System.in);

        //delcare and assign varibales
        int wlength = 0;

//program intro
        System.out.println("\t*** Pig Latin Creator***");

        //ask for user input
        System.out.println("\nEnter a word to be translated");
        String input = in.nextLine();


//if word is only one letter
        if (input.length() == 1) {
            System.out.println(input);


//else tranlate word into pig latin
        } else {
            wlength = input.length();


            String word = input.substring(1, wlength);

            //output the final answer
            System.out.println("\n" + input + " in Pig latin is " + "" + word + input.charAt(0) + "a"+".");
        }

    }//end of main method
}//end of program
