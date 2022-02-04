package arrayhandsontest;

/** Array hands on test
 *June 4th 2015
 * @author mshaikh0798
 */


//import java libraries
import java.text.DecimalFormat;

public class ArrayHandsOntest {

    public static void main(String[] args) {

        //declare and assing decimal format 
        DecimalFormat oneDP = new DecimalFormat("###.0");
        DecimalFormat twoDP = new DecimalFormat("###.00");
        //declare and assing arrays along with elements
        System.out.println("\t*** ARRAY HANDS ON TEST***");

        String room[] = new String[3];

        double width[] = new double[3];

        double length[] = new double[3];

        double area[] = new double[3];

        double hardwood[] = new double[3];
        
        //assing the arrays elments as the programmer
        room[0] = "Family Room";
        room[1] = "Dining Room";
        room[2] = "Living Room";


        //assign width as the prgrammer
        width[0] = 11.5;
        width[1] = 12;
        width[2] = 12.75;

        //assign length as the programmer
        length[0] = 15;
        length[1] = 16.25;
        length[2] = 18;

        //find area for all rooms
        for (int i = 0; i < room.length; i++) {

            area[i] = width[i] * length[i];

        }

        //calculate cost to install hardwood
        for (int i = 0; i < room.length; i++) {
            hardwood[i] = area[i] * 3.75;

        }


        //output the area and cost of each room
        for (int i = 0; i < room.length; i++) {

            System.out.println("\nThe " + room[i] + " is " + oneDP.format(area[i]) + " square feet " + "and the total cost for hardwood is $" + twoDP.format(hardwood[i]) + ".");

        }

        //find total cost of all three rooms
        System.out.println("\nThe total cost for intalling hardwood in all 3 rooms would be $" + twoDP.format(totalArray(hardwood))+".");

        ////find average cost per room
        System.out.println("\nThe average cost per room is $" + twoDP.format(totalAverage(hardwood))+".");


        //output the most expensive room to install hardwood in
        System.out.println("\nThe most expensive room to install hardwood is the " + highest(hardwood, room)+".");

        //output the least expensive room to install hardwood in
        System.out.println("\nThe cheapest room to install hardwood is the "+ lowest(hardwood,room)+".");
        
    }//main method

    //array to find total amount of money to intstall hardwood
    public static double totalArray(double[] A) {
        double total = 0;

        for (int i = 0; i < A.length; i++) {
            total += A[i];

        }
        return (total);


    }

    //array to find the average of all cost in the rooms
    public static double totalAverage(double[] G) {

        double totalAvg = 0;

        for (int i = 0; i < G.length; i++) {
            totalAvg += G[i];

        }

        return (totalAvg / G.length);
    }

    //array to find the most expensive room to install hardwood in
    public static String highest(double[] A, String[] P) {
        // assigning the first element of each array as the max
        double max = A[0];
        String mostExpensiveRoom = P[0];
        // loop through the remaining elements and if a higher value is

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                mostExpensiveRoom = P[i];
            }
        }
        return mostExpensiveRoom;
    }

    //method to return the lowest value in an array
    
    public static String lowest(double[] A, String[] P) {
        // assigning the first element as the min
        double min = A[0];
        String minIndex = P[0];
        // loop through the remaining elements and if a lower value is

        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {

                min = A[i];
                minIndex = P[i];
            }
        }
        return minIndex;
    }
}//closes public class