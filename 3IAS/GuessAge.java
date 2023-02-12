package JavaSchool;
import java.util.*;
/*--------------------------------Instructions-----------------------------------------
Guess the age
Write a program that allows you to guess the age extracted from the computer. Therefore
a) The computer must extract a random number between 0 and 99 (see note in the box
following)
b) Have the user enter the age
c) If the age is correct, communicate “Bravo. Centered date "
d) If the age is close (higher or lower than no more than 5 years) communicate "You went there
close, you were wrong by "X" years
e) In all other cases: wrong answer you are a good X years away
Use the Random method
the static method Math.random () returns a double value between 0.0 and 1.0. Example:
double v = Math.random ();
From this value it is then possible to obtain an integer value by carrying out multiplication 
and casting operations.
For example, if we want to obtain an integer between 0 and 99, just multiply the random value
generated - which is between 0.0 and 1.0 - for 100 and cast the result:
int n = (int) (Math.random () * 100);
*/
public class GuessAge {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        String Quit;
        do{        
            // genera un età casuale fra 0 e 100 
            int RandomAge= (int) (Math.random() * 100), UserAge ,HowFar=0;
                
            System.out.println(RandomAge);
            System.out.println("Enter your age");
            UserAge= scn.nextInt();        

            if (UserAge==RandomAge){ // if ageuser and random age are equal
                System.out.println("Guessed Date!");              
            
            } else if (UserAge<=RandomAge){
                HowFar= RandomAge-UserAge;// I calculate the difference between the random age and the user age
                } if (HowFar<=5){ // se la differenza fra le due età è di massimo 5 numeri
                System.out.println("You've come close, you've been wrong "+ HowFar +" years");         
                
            } else if (UserAge>=RandomAge){
                HowFar= UserAge-RandomAge;
                } if (HowFar<=5){ // if the difference between the two ages is a maximum of 5 numbers
                System.out.println("You've come close, you've been wrong "+ HowFar +" years");            
                        
            } else {       
                //to make the result always positive I square and then sub-square root    
                HowFar=(int)Math.sqrt((int)Math.pow(UserAge-RandomAge,2));            
                System.out.println("Wrong answer, you are "+ HowFar +" years away");
            }
        /* I ask for an input to ask whether to repeat the execution of the program again
            or finish */
            System.out.println(" ");
            System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
            Quit= scn.next().toLowerCase();            
            System.out.println("-------------------------------------------------------------------");            
    }   while (!(Quit.equals("q")));             
        scn.close();
    }
}
