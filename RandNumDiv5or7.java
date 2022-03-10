package JavaSchool;
import java.util.*;
/*-----------------------------------PSEUDOCODE-----------------------------------------------
Extract 50 random numbers between 101 and 200; communicate with respect to the 50 numbers drawn
to. How many numbers are divisible by 3 and how many by 7
b. The percentage of numbers divisible by 3
c. The percentage of numbers divisible by 7
*/
public class RandNumDiv5or7 {
    public static void main (String args[]){
    Scanner Scn = new Scanner(System.in);
    String Quit=" ";

    do {
        int RandomNum=0, Three=0, Seven=0; 
        float ThreePerc=0, SevenPerc=0;
        
        
        Quit=""; Three=0; Seven=0;ThreePerc=0;SevenPerc=0;
        for (int i=1;i<=50;i++){
            RandomNum= (int) (Math.random()* (201-100)+1)+100; //random  number from 100 to 201
            System.out.println(RandomNum);
            if (RandomNum%3==0){ // if the number is divisible by 3
                Three=Three+1;
            }
            else if (RandomNum%7==0){ // if the number is divisible by 7
                Seven=Seven+1;
            }
        }
        System.out.println("numbers divisible by three : "+Three+", By seven: "+Seven);
        ThreePerc=(float) Three;
        SevenPerc=(float) Seven;
        ThreePerc=(ThreePerc/50)*100;
        SevenPerc=(SevenPerc/50)*100;

        System.out.println("% Divisible by number Three: "+ThreePerc+"% - % divisible by 7: "+SevenPerc+"%");

        /* I ask for an input to ask whether to repeat the execution of the program again
            or finish */
            System.out.println(" ");
            System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
            Quit= Scn.next().toLowerCase();            
            System.out.println("-------------------------------------------------------------------");            
    }   while (!(Quit.equals("q"))); 
    Scn.close();
    }
}
