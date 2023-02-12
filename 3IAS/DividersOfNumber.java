package JavaSchool;
import java.util.*;
/*----------------------------------------Instructions-------------------------------
Displays the divisors of an integer supplied as input (excluding the number itself).
Example: 9-> 1 3

Begin
Int Num;

    Read("Enter a number")
    Num<--
    For I=0 to <Num
        If (Num%I==0)
            Write(I)
        End If
    End For
End
*/

public class DividersOfNumber {
    public static void main(String args[]){
    Scanner Scn = new Scanner(System.in);
    int Num;
    String Quit;
    
    do{    
        System.out.println("Enter a number");
        Num= Scn.nextInt();
        System.out.println("-----------------------------");
        for (int i=1;i<Num;i++){
            if (Num%i==0){ // if the remainder "0" is obtained when dividing the entered number and the counter
               System.out.println(i); // show output
            }
        }
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