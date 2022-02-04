// opens package "multiplication table"
package multiplication.table;

/**Multiplication Table
 *Febuary 4th 2015
 * @author mshaikh0798
 */

import java.util.Scanner;
public class MultiplicationTable {

   
    public static void main(String[] args) {
        
        
        //declare and assing variables and Scanner and that mumbo jumbo
        Scanner in = new Scanner(System.in);       
        System.out.println("Input a userNumber that you would like to see a multiplication table of");
        int userNumber = in.nextInt();
        
        for (int i=0; i<=12;i++)
        {
            int total = userNumber*i;
            System.out.println("\n"+userNumber+ " x " + i + " = "+total);  
        }
        
//        System.out.println(userNumber + " x " + 0 +" = "+userNumber*0);
//        
//        System.out.println(userNumber + " x " + 1 +" = "+userNumber*1);
//        
//        System.out.println(userNumber + " x " + 2 +" = "+userNumber*2);
//        
//        System.out.println(userNumber + " x " + 3 +" = "+userNumber*3);
//        
//        System.out.println(userNumber + " x " + 4 +" = "+userNumber*4);
//        
//        System.out.println(userNumber + " x " + 5 +" = "+userNumber*5);
//        
//        System.out.println(userNumber + " x " + 6 +" = "+userNumber*6);
//        
//        System.out.println(userNumber + " x " + 7 +" = "+userNumber*7);
//        
//        System.out.println(userNumber + " x " + 8 +" = "+userNumber*8);
//        
//        System.out.println(userNumber + " x " + 9 +" = "+userNumber*9);
//        
//        System.out.println(userNumber + " x " + 10 +" = "+userNumber*10);
//        
//        System.out.println(userNumber + " x " + 11 +" = "+userNumber*11);
//        
//        System.out.println(userNumber + " x " + 12 +" = "+userNumber*12);
    }
}

