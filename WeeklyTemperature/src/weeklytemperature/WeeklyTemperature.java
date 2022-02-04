package weeklytemperature;

/**
 *
 * @author mshaikh0798
 */
import java.util.*;

public class WeeklyTemperature {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("***7 Day Temperature History***");
        String day[] = new String[7];
       int temp[]=new int[7];

            day[0] = "Sunday";
            day[1] = "Monday";
            day[2] = "Tuesday";
            day[3] = "Wednesday";
            day[4] = "Thursday";
            day[5] = "Firday";
            day[6] = "Saturady";
            
            
           
           for (int i = 0; i < temp.length; i++) {
           
            //assign the individual elements with names
            System.out.print("\nEnter the temperature for " + day[i] + ":");
            temp[i] = in.nextInt();
            

        }
        
        for (int i = 0; i < temp.length; i++) {
            
            System.out.println("");
            
        }
    }
}
