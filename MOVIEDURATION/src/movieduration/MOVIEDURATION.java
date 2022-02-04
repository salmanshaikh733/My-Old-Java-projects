
package movieduration;

/**movieDuration
 *Febuary 13th 2015
 * @author mshaikh0798
 */

import java.util.Scanner;
import java .text.DecimalFormat;
public class MOVIEDURATION {
    
    public static void main(String[] args) {
        DecimalFormat in = new DecimalFormat("#.##");
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter the movie in duration in minutes");
        double mDuration = userInput.nextDouble();
        
        double hrs = 60;
        
        double timeFormat = mDuration/hrs;
        
        System.out.println("MOVIE DURATION IN HOURS AND MINUTES" + "\n" +in.format(timeFormat)+" hours and minutes");
        
        
        
        
        
        
        
    }
}
