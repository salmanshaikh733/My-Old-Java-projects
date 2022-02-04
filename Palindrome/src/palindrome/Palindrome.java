
package palindrome;

/**
 *
 * @author mshaikh0798
 */

import java.util.*;
import java.lang.*;
public class Palindrome {

    
    public static void main(String[] args) {
        String reverse ="";
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter a phrase or word");
        String word=in.nextLine();
        
int spaces=0;

for (int n=0;n<=word.length()-1;n++)
    
    if ((word.charAt(n)+"").equals(" "))
        
    {
        
        spaces++;
    }
        System.out.println(spaces);
         
        word=word.replaceAll(" ","");
        
        
        
       for (int i=word.length()-1;i>=0;i--)
       {
            reverse = reverse +word.charAt(i);
            
            
       }   
       
       System.out.println(reverse);
       
       if (word.equalsIgnoreCase(reverse))
       {
           
           System.out.println("\n"+word+" is a palindrome");
           spaces+=1;
           System.out.println("Number of words "+spaces);
//           spacecount+=1;
//           System.out.println(" the number of words are "+spacecount);
           
       }   
       
       else 
       {
           System.out.println("\n "+word+" is not a palindrome");
            
       }
           
    }
}
