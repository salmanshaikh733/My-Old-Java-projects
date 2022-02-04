
package semesteraverage;

/**semester average
 *June 24th 2015
 * @author mshaikh0798
 */

//import java libaries
import java.util.*;
import java.text.*;

public class SemesterAverage {

    
    public static void main(String[] args) {

        //declare and assing decimal format and scanner
        DecimalFormat oneDP = new DecimalFormat("###.0");
        Scanner in = new Scanner(System.in);
        
        //program intro
        System.out.println("\t***Semester Average Calculator***");
        
        //delare course array
        String courses[]=new String [4];
        
        //declare marks array
        double marks []=new double[4];
        
        //for loop to enter marks and couress for alll 4 
        for (int i=0; i<marks.length; i++)
        {
            //ask for marks and course info
            System.out.print("\nEnter the name of a course you have teken this semster: ");
            courses[i]=in.nextLine();
            
            
            System.out.print("Enter the final mark you have received in this course: ");
            marks[i]=in.nextInt();
            in.nextLine();
        }
        //eend of for loop
        
        
        //display course and marks in  a table
        System.out.println("\n\tCourse\tMark");
        System.out.println("\t"+courses[0]+"\t"+marks[0]);
        System.out.println("\t"+courses[1]+"\t"+marks[1]);
        System.out.println("\t"+courses[2]+"\t"+marks[2]);
        System.out.println("\t"+courses[3]+"\t"+marks[3]);
        
        //out the average semester marks by calling average method
        System.out.println("\nThe average mark for these four courses is "+ oneDP.format(totalAverage(marks))+"%");
    }//end of main method
    
    //average method
     public static double totalAverage(double[] G) {

        double totalAvg = 0;

        for (int i = 0; i < G.length; i++) {
            totalAvg += G[i];

        }

        return (totalAvg / G.length);
    }//end of average method
     
}// end of program
