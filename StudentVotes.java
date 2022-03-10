package JavaSchool;
import java.util.*;
/*
Write a java program that addresses the following problem:
Given in input the marks of a student communicate the number of pass and fail knowing that it is
student attends 8 disciplines; communicate in output also the average of the marks.
Trace of solution
For…. 1 to 8
Block of instructions to repeat
Votes input (1 at a time)
Check sufficiency or insufficiency: count how many sufficiency and insufficiency
Add each votes entered to the votes 
previously inserted
End of block of instructions to repeat
Calculation of the averages
Communicate average number
Communicate enough, insufficient numbers
*/
public class StudentVotes {
    public static void main(String args[]){
        Scanner Scn=new Scanner(System.in);
        String Quit="";

        do{
            Double Votes, Med=0.0;
            int Enough=0, Insufficiency=0;
            
            for (int i=1;i<9;i++) {
                System.out.println("Enter the "+ i +" ° "+" votes");
                Votes= Scn.nextDouble();
                if (Votes<6){
                    Insufficiency= Insufficiency+1;
                }
                else{
                    Enough=Enough+1;
                }
                Med= Med+Votes;
            }
            Med=Med/8;
            System.out.println("N° insufficient subjects: "+Insufficiency+", enough: "+Enough);
            System.out.print("grade average: "+Med);
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
