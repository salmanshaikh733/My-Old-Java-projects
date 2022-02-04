
package javais.fun;

/**
 *
 * @author mshaikh0798
 */
public class JAVAISFUN {

   
    public static void main(String[] args) {
        
        
        
        
        String sentence=("java is fun!");
        
        String tongueTwister = ("She sell seashells");
        //upper case
        System.out.println(sentence.toUpperCase());
        //length of sentence
        System.out.println(sentence.length());
        // last letter in sentence
        System.out.println(sentence.charAt(11));
        //first letter in sentence
        System.out.println(sentence.charAt(0));
        
        System.out.println(sentence.charAt(sentence.length()-1));
        
        System.out.println("index position of last space " +sentence.lastIndexOf(""));
        
        System.out.println("Create a substring "+sentence.substring(5,7));
        
        //creates the substring fun!
        System.out.println("Creates the substring "+sentence.substring(8));
        
        System.out.println(sentence.indexOf("a"));
        
        
        System.out.println(tongueTwister.lastIndexOf("ll"));
        
        
        
    }
}
