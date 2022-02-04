package compass;

/**
 *
 * @author mshaikh0798
 */
import java.util.*;

public class Compass {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter a Direction:");
        String bearings = in.next();

        String starting = bearings.charAt(0) + "";

        String degrees = bearings.substring(1, bearings.length() - 1) + "";

        String ending = bearings.charAt(bearings.length() - 1) + "";

        //selection sequence to assign full word to the initial for starting direction
        if (starting.equalsIgnoreCase("n")) {
            starting = "North";


        } else if (starting.equalsIgnoreCase("e")) {
            starting = "East";


        } else if (starting.equalsIgnoreCase("w")) {
            starting = "West";


        } else if (starting.equalsIgnoreCase("s")) {
            starting = "South";


        } else {
            System.out.println("INVALID!");
        }



        if (ending.equalsIgnoreCase("n")) {
            ending = "North";


        } else if (ending.equalsIgnoreCase("e")) {
            ending = "East";


        } else if (ending.equalsIgnoreCase("w")) {
            ending = "West";


        } else if (ending.equalsIgnoreCase("s")) {
            ending = "South";


        } else {
            System.out.println("INVALID!");
        }


        System.out.println("Start facing " + starting + ". Then turn " + degrees + " degrees towards " + ending);

    }
}