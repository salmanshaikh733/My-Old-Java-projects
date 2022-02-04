package nhlleades;

/**
 *
 * @author mshaikh0798
 */
//import java libraries
import java.util.*;

import java.text.*;

public class NHLLeades {

    //the main method
    public static void main(String[] args) {

        //declare and assign scanner
        Scanner in = new Scanner(System.in);
        DecimalFormat oneDP = new DecimalFormat("###.0");
        //intro message
        System.out.println("\t*** NHL LEADERS***");

        //decalre and assign arrays 
        String players[] = new String[5];
        int goals[] = new int[5];
        int assits[] = new int[5];
        //int totalArrays[]=new int[5];

        //assign arrays with nghl leaders name
        players[0] = "Tyler Johnson";
        players[1] = "Nikita Kucherov";
        players[2] = "Ryan Getzlaf";
        players[3] = "Corey Perry";
        players[4] = "Steven Stamkos";

        //get number of goals for players
        for (int i = 0; i < goals.length; i++) {
            System.out.println("\nEnter the goals for " + players[i]);
            goals[i] = in.nextInt();
            System.out.println("\nEnter the assist for " + players[i]);
            assits[i] = in.nextInt();

        }
        System.out.println("\nPLayer \t\t\t   Goals \t\t\tAssists");
        //get number of assits for players
        for (int i = 0; i < players.length; i++) {

//output table for players with goals are assits 
            System.out.println("\n" + players[i] + "\t\t\t" + goals[i] + "\t\t\t" + assits[i]);


        }

        int points = 0;
        System.out.println("\nPoints");
        System.out.println("");
        //output table with points 
        for (int i = 0; i < players.length; i++) {
            points = goals[i] + assits[i];

            System.out.println("" + players[i] + "\t" + points);

        }

        //higest score
        int max = assits[0];
        String HigestPlayer = players[0];
        for (int i = 1; i < goals.length; i++) {
            // if the element is higher than the max reassign with that

            if (max < assits[i]) {
                max = assits[i];
                HigestPlayer = players[i];
            }
        }
        //output max goals
        System.out.println("\nMax assits are by " + HigestPlayer);


        //lowest score
        String lowestPlayer = players[0];
        int min = goals[0];
        for (int i = 1; i < goals.length; i++) {
            // if the element is higher than the max reassign with that

            if (min > goals[i]) {
                min = goals[i];
                lowestPlayer = players[i];
            }

        }

        System.out.println("\nMin goals are by " + lowestPlayer);

        //the total number of goals are arrays
        int totalGoals = 0;
        int totalAssists = 0;

        //total number of goals
        for (int i = 0; i < goals.length; i++) {

            totalGoals += goals[i];
            totalAssists += assits[i];
        }

        // System.out.println("\n" + "Total number of goals are "+totalGoals);
        System.out.println("\n" + "Total number of assits are " + totalAssists);

        //average number of goals
        double average = totalGoals /= goals.length;

        //use a method to output average number of assits
        System.out.println("\nThe average number of goals are " + totalAverage(assits));

        //output the total number of goals scored by all players
        System.out.println("\nThe total numbers of goals scored are " + totalArray(goals));

        //out the player with the highest number of assits
        System.out.println("\nThe player with the highest assists is " + highest(assits,players));

    }

    //method to add all the elements in an int array
    public static int totalArray(int[] A) {
        int total = 0;

        for (int i = 0; i < A.length; i++) {
            total += A[i];

        }
        return (total);


    }

    //method to find the average in an int array
    public static double totalAverage(int[] G) {

        double totalAvg = 0;

        for (int i = 0; i < G.length; i++) {
            totalAvg += G[i];

        }

        return (totalAvg / G.length);
    }

    public static String highest(int[] A, String[] P) {

        int max = A[0];
        String maxPlayer = P[0];
        //loop through the remaining elements and if a higher value is encountred reasign both varibales
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                maxPlayer = P[i];
            }

        }
        return maxPlayer;
    }
}
