
package barbietrivia;

/**BARBIE TRIVIA
 *March 2nd 2015
 * @author mshaikh0798
 */

//import jOptions
import javax.swing.*;

public class Barbietrivia {


    public static void main(String[] args) {
        
        //insert pictures in JOptions
        final ImageIcon icon = new ImageIcon("H:\\Documents\\zombieman.png");
        final ImageIcon icon1 = new ImageIcon("H:\\Documents\\zombie1.jpg");
        final ImageIcon icon2 = new ImageIcon("H:\\Documents\\wrong.gif");
        final ImageIcon icon3 = new ImageIcon("H:\\Documents\\rickg.jpg");
        final ImageIcon icon4 = new ImageIcon("H:\\Documents\\dixon.jpg");
        final ImageIcon icon5 = new ImageIcon("H:\\Documents\\zombieman.png");
        final ImageIcon icon6 = new ImageIcon("H:\\Documents\\zombieman.png");
        final ImageIcon icon7 = new ImageIcon("H:\\Documents\\zombieman.png");
        final ImageIcon icon8 = new ImageIcon("H:\\Documents\\zombieman.png");
        final ImageIcon icon9 = new ImageIcon("H:\\Documents\\zombieman.png");
        final ImageIcon icon10 = new ImageIcon("H:\\Documents\\zombieman.png");
        
        JOptionPane.showMessageDialog(null,"WELCOME TO ZOMBIE TRIVIA SURVIVAL , Click 'OK' to continue","ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION,icon );
        
        //declare and assing varibales
        int points=0;
        
        String userAnswer = null;
        
        
        // first answer
        userAnswer = JOptionPane.showInputDialog(null,"You see a zombie walking towards you, what do you do?\n 1.Give it a hug. \n 2. Run away \n 3. make a bunch of noise in hopes of scaring it off. \n 4.Sing thriller by micheal jackson\n","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemtents for first answer
        if ("2".equals(userAnswer)) 
        {
            
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, RUNNERS WILL SURIVIVE!!!","ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION);
            points++;            
        }
        
        else 
        {
            
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, correct answer was number 2","ZOMBIE TRIVIA",JOptionPane.ERROR_MESSAGE,icon2);
        }
        
        
        
        //second answer
        userAnswer = JOptionPane.showInputDialog(null,"You run into a dead end and barricade yourself in, while being chased by a horde of zombies, what is your best plan of action?\n 1. do nothing, this is the end.\n 2.Cry for help. \n 3.try to hide, and hope help arrives. \n 4.Distract them and make a quick escape.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for second question
        if ("4".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, ITS BEST OPTION","ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION);
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 4","ZOMBIE TRIVIA",JOptionPane.ERROR_MESSAGE,icon2);
            
        }
        
        // third answer
        userAnswer = JOptionPane.showInputDialog(null,"You and another survivor run into each other, what happens next.\n 1} be friends and survive together.\n 2.kill him and take his gear, ITS KILL OR BE KILLED. \n 3.try to be freinds and steal his gear when he doesnt see it coming. \n 4.go your seperate ways.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for third question
        if ("4".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, theres no need for violence even during the apocalypse","ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION);
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 4","ZOMBIE TRIVIA",JOptionPane.ERROR_MESSAGE,icon2);
            
        }
        
        // fourth answer 
        userAnswer = JOptionPane.showInputDialog(null,"You are out of water and food, and you're starving, how do your solve this problem?\n 1} cut your hand and eat it, you have two of them for a reason. .\n 2.eat bugs and other insects, good source of proteins. \n 3.try to craft a makeshift bow and hunt. \n 4.do nothing you need to lose weight anyway.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for fourth  question
        if ("3".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, FYI thats kinda how you survive");
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 3","Zombie Trivia",JOptionPane.ERROR_MESSAGE,icon2);
            
        }
        //output points 
        JOptionPane.showMessageDialog(null,"YOU HAVE " + points +" POINTS" );
        
        
        // fifth answer
        userAnswer = JOptionPane.showInputDialog(null,"which off the following ways can a human get infected by the zombie plague?\n 1}. both 3 and 4.\n 2.rubbing up against zombies in a respectful manner. \n 3.get bitten by zombies. \n 4.eating zombie flesh.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for fifth question
        if ("1".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, you can rub up against them all you want");
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 1","Zombie Trivia",JOptionPane.ERROR_MESSAGE,icon2);
            
        }
        
        // sixth answer
        userAnswer = JOptionPane.showInputDialog(null,"what is the best way to evade a zombie?\n 1. run away and hide, zombies move slower than you.\n 2.climb up to a point of elevation. \n 3.go underwater zombies cant swim . \n 4.all of the above.",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for sixth question
        if ("4".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, anyone of these are effective in evading zombies");
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 4");
            
        }
        
        // seventh answer
        userAnswer = JOptionPane.showInputDialog(null,"best weapon for zombie apocalypse?\n 1.the common hand gun.\n 2.makeshift bow and arrow . \n 3.the good old baseball bat. \n 4.machete.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for seventh question
        if ("2".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, BOW AND ARROW ALLOW TO HUNT SILENTLY FROM A SAFE DISTANCE");
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 2","ZOMBIE TRIVIA",JOptionPane.ERROR_MESSAGE,icon2);
            
        }
        
        // eightth answer
        userAnswer = JOptionPane.showInputDialog(null,"Best way to kill a zombie?\n 1. play some Justin bieber.\n 2.repeadetly stab it like a mad man. \n 3.smash it in the head with a blunt object. \n 4.give it a hug.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for eightth question
        if ("3".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, JB ONLY WORKS ON HUMANS SADLY :*( ");
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 3","ZOMBIE TRIVIA",JOptionPane.ERROR_MESSAGE,icon2);
            
        }
        JOptionPane.showMessageDialog(null,"YOU HAVE" + points);
        //ninth answer
        userAnswer = JOptionPane.showInputDialog(null,"what is the best place to get food in the zombie apocalypse?\n 1} grocery store.\n 2.trash cans. \n 3.abandoned homes. \n 4.all of the above.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for ninth question
        if ("3".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, groceries stores get sacked first, people usually leave things behind in homes");
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 3","ZOMBIE TRIVIA",JOptionPane.ERROR_MESSAGE,icon2);
            
        }
        
        // tenth answer
        userAnswer = JOptionPane.showInputDialog(null,"what direction should head during a zombie apocalypse?\n 1. North.\n 2.east. \n 3.west. \n 4.south.","ZOMBIE TRIVIA",JOptionPane.QUESTION_MESSAGE);
        
        // if statemetns for tenth question
        if ("1".equals(userAnswer))
        {
            JOptionPane.showMessageDialog(null,"\tCORRECT ANSWER, ZOMBIES HAVE TOUGHER TIME SURVIING THE COLD");
            points ++;
            
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null,"WRONG ANSWER, Correct answer was number 1","ZOMBIE TRIVIA",JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        //final output with score and ranking this is the end of the game 
        if (points == 10 )
        
        {
            JOptionPane.showMessageDialog(null,"You are ranked as a survival specialist like DERYLE DICKSON, with a total amount of "+ points+"points","ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION,icon4);
            
        }
        
        else if (points >= 5 && points <= 7)
        {
           JOptionPane.showMessageDialog(null,"You are ranked as a survival expert and leader like Rick Grimes, with a total amount of " + points+ "Points","ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION,icon3 );
            
        }
                
        else if (points >= 3 && points < 5)
        {           
             JOptionPane.showMessageDialog(null," You are ranked as a normal survivor, with a total amount of " + points+ "Points " ,"ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION);
        }
        
        else         
        {
            JOptionPane.showMessageDialog(null,"SORRY YOU DID NOT SURVIVE THE APOCALYPSE, with a total amount of "+points+"Points ","ZOMBIE TRIVIA",JOptionPane.DEFAULT_OPTION,icon1);
            
        }// end of output
                    
        
    }// end of main method
    
}// end of program
