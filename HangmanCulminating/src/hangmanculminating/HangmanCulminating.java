package hangmanculminating;

/**hangman
 *June 12 2015
 * @author mshaikh0798
 */

//import java libraries
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import javax.swing.ImageIcon;
import java.util.*;

public class HangmanCulminating {

    public static int number;
//int number=0;
    public static void main(String[] args) {
        System.out.println(" O"+"\n/|\\"+"\n/ \\");
        
        final ImageIcon icon = new ImageIcon("H:\\Documents\\Hangman\\sauron.jpg");
        //final ImageIcon icon2 = new ImageIcon("H:\\Documents\\Hangman\\gollum.jpg");
        
        //declare and assign scanner
        //Scanner in = new Scanner(System.in);

        //decalre and assgin variables
        String userAnswer = null;
        String word = null;
        String hidden = "***";
        int attempts = 7;
        String letter = null;
        String hangman=null;
        //String word1 = null;


        //declare hint array
        String hint[] = new String[30];

        hint[1] = "Someone who is the main protagonaist";
        hint[2] = "Somone who does not look the most appealing";
        hint[3] = "Word that is used in ____ Chirstmas";
        hint[4] = "They are not men, elves, or dwards";
        hint[5] = "They have pointy ears";
        hint[6] = "They are actually real speices";
        hint[7] = "Forged in the fires of mount doom";
        hint[8] = "A town or a place in middle earth";
        hint[9] = "Someone who is hated on the internet";
        hint[10] = "Goes by the name strider";
        hint[11] = "Mainly uses a bow";
        hint[12] = "Where Frodos journey actually begins";
        hint[13] = "Really cool city";
        hint[14] = "Looks like hell";
        hint[15] = "He sees everything";
        hint[16] = "_____ The white";
        hint[17] = "starts with letter M";
        hint[18] = "Really greedy for gold";
        hint[19] = "A really big creature";
        
        //end of arrays

        int playAgain = 0;
        
        int hints =0;

        do {
            //program; intro
            JOptionPane.showMessageDialog(null, "WELCOME TO HANGMAN: BY SALMAN SHAIKH", "LORD OF THE RINGS", JOptionPane.DEFAULT_OPTION, icon);

            userAnswer = JOptionPane.showInputDialog(null, "ENTER A DIFFICULTY- EASY, MEDIUM, OR HARD!!", "LORD OF THE RINGS", JOptionPane.QUESTION_MESSAGE);


// choose level
            if ("easy".equalsIgnoreCase(userAnswer)) {
                word = easyWord();
                word.toLowerCase();
                System.out.println(word);
                JOptionPane.showMessageDialog(null, "There are " + word.length() + " letters to be solved");

                for (int i = 3; i < word.length(); i++) {
                    hidden = hidden + "*";

                }
                //JOptionPane.showMessageDialog(null, "\t" + hidden);
                System.out.println(hidden);



            } else if ("medium".equalsIgnoreCase(userAnswer)) {
                word = medWord();
                word.toLowerCase();
                System.out.println(word);
                JOptionPane.showMessageDialog(null, "There are " + word.length() + " letters to be solved");

                for (int i = 3; i < word.length(); i++) {
                    hidden = hidden + "*";

                }
                //JOptionPane.showMessageDialog(null, "\t" + hidden);
                System.out.println(hidden);


            } else if ("hard".equalsIgnoreCase(userAnswer)) {
                word = hardWord();
                word.toLowerCase();
                System.out.println(word);
                JOptionPane.showMessageDialog(null, "There are " + word.length() + " letters to be solved");
                JOptionPane.showMessageDialog(null,"There are no hints available for this difficulty");
                for (int i = 3; i < word.length(); i++) {
                    hidden = hidden + "*";

                }
                //JOptionPane.showMessageDialog(null, "\t" + hidden);
                System.out.println(hidden);

            }//end of if statments choosing difficulty


            //while loop
            while (hidden.contains("*") && attempts > 0) {

                //draw hangman
                JOptionPane.showMessageDialog(null, hidden+" You have " + attempts + " attempts");
                //JOptionPane.showMessageDialog(null, "You have " + attempts + " attempts");
                letter = JOptionPane.showInputDialog(null, "Enter a letter");
                hangman=drawHangman(attempts);
                if(attempts<7)
                {
                JOptionPane.showMessageDialog(null,hangman,"Lord of the Rings", JOptionPane.DEFAULT_OPTION);
                }
                
                //System.out.println(drawHangman(attempts));
                //letter=letter.toLowerCase();


                //if statment for switching stars with words
                if (word.contains(letter)) {
                    
                     JOptionPane.showMessageDialog(null, "CORRECT!!!");

                    while (word.contains(letter) == true) {
                        int index = word.indexOf(letter);
                        int Index = word.lastIndexOf(letter);
                        
                        hidden = hidden.substring(0, index) + letter + hidden.substring(index + 1);
                        hidden = hidden.substring(0, index) + letter + hidden.substring(Index + 1);

                        word = word.replace(letter, "*");

                    }

                    // if words does not exist decrease attempts and tell them they are wrong
                } else if (word.contains(letter) == false) {
                    attempts -= 1;
                    JOptionPane.showMessageDialog(null, "wrong try again");
                   
                    //hint enchancement 
                  if(!"hard".equalsIgnoreCase(userAnswer)&&attempts>0)
                  {
                    hints = JOptionPane.showConfirmDialog(null, "Do you want a hint, you will lose an attempts", "Lord of the Rings", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    
                    if(hints== (JOptionPane.YES_OPTION))
                    {
                        attempts--;
                        String hints1=hint[number];  
                         JOptionPane.showMessageDialog(null, hints1);
                        
                    }
                }

            }
                
            }
            //output rank
            JOptionPane.showMessageDialog(null, ranking(attempts));

            playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again", "Lord of the Rings", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           attempts=7;
        //end of while loop for hangman main game
            
    
        
   
    }while(playAgain==(JOptionPane.YES_OPTION));
        
    } //end of mainmethod
    
    
    //easy method to choose easy word
    public static String easyWord() {
        String word = null;
        String[] easy = new String[10];
         number = (int) (Math.random() * 10 + 1);

        easy[0] = "frodo";
        easy[1] = "gimli";
        easy[2] = "sam";
        easy[3] = "merry";
        easy[4] = "orcs";
        easy[5] = "elves";
        easy[6] = "men";
        easy[7] = "ring";
        easy[8] = "shire";
        easy[9] = "troll";



        word = easy[number];



        return word;



    }

//medium method to choose medium size word
    public static String medWord() {
        String word = null;
        String[] easy = new String[10];
        number = (int) (Math.random() * 10 + 1);

        easy[0] = "aragorn";
        easy[1] = "legolas";
        easy[2] = "rivendal";
        easy[3] = "azgard";
        easy[4] = "mordor";
        easy[5] = "sauron";
        easy[6] = "gandalf";
        easy[7] = "mithrin";
        easy[8] = "dawrfs";
        easy[9] = "balrog";


        word = easy[number];



        return word;

    }

    //hard method to choose hard method
    public static String hardWord() {
        String word = null;
        String[] easy = new String[10];
         number = (int) (Math.random() * 10 + 1);

        easy[0] = "finduilasofDolAmroth ";
        easy[1] = "hyarmendacilII";
        easy[2] = "lotho Sackville-Baggins";
        easy[3] = "oin,King of Durin's Folk-Oin";
        easy[4] = "draugluin";
        easy[5] = "mithrandir";
        easy[6] = "robinSmallburrow";
        easy[7] = "daddyTwofoot";
        easy[8] = "celebrían";
        easy[9] = "hornblower";



        word = easy[number];



        return word;

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //method to choose rank
    public static String ranking(int a) {
        String rank = null;

        if (a == 6) {
            rank = "Perfect game, " + a + " points";

        } else if (a == 4 || a == 5) {

            rank = "Mediocore game, " + a + " points";
        } else if (a == 2 || a == 3) {
            rank = "Okay, but try harder next time, " + a + " points";

        } else if (a == 1 || a == 0) {
            rank = "You are horrible at this game, you got " + a + " attemps left";

        }
        return rank;
    }

    //method to draw hangman depending on score
    public static String drawHangman(int a)
    {
        String hangman=null;
        
        if (a==6)
        {
            hangman = ("         O");
               
           
        }
        else if (a==5)
            {
            hangman=("            O"+"\n             |");
        
    }
        else if (a==4)
        {
            hangman=("             O"+"\n             /|");
        }
        else if (a==3)
        {
            
            hangman=("             O"+"\n             /|\\");
            
        }
        else if(a==2)
        {
            
            hangman=("            O"+"\n            /|\\"+"\n             |");
        }
        else if (a==1)
        {
            hangman=("             O"+"\n             /|\\"+"\n             / \\ ");
            
        }
//        else if (a==0)
//        {
//            hangman=("           O"+"\n            /|\\"+"\n         / \\");
//        }
        return(hangman);
        
  }

    
    
            

}//end of program

