package JavaSchool;
import java.util.*;

/* ---------------------------------Instructions--------------------------------------------------------------------------------
Develop a program, in pseudocode and later in Java, which reads a sequence of ten numbers and writes (communicates) the largest.
Finally, develop the execution track (with significant input).
Some examples of performance tracks, for those who are not clear about the concept:
http://users.csc.calpoly.edu/~jdalbey/101/Resources/codetrace.html
https://www.youtube.com/watch?v=5mxT9x5rgCg
*/
/* PseudoCode
Begin
    Num:=0
    Temp:=0
    For i=1 To 10
        write("Enter the N Numbers")
        Num=<--
        If (Num<Temp) Then
        Temp=Num;
        End If
    End For
    write("The larghest number typed is ")
End

*/

public class MaxOfNumbers {
    public static void main (String[]args){ 
    Scanner Scn = new Scanner(System.in);
    int Num=0, Temp=0;
    String Quit="";

    do{ Temp=0;
        for (int i=1; i<=10; i++){
            System.out.println("Enter the "+i+"° numbers");
            Num=Scn.nextInt();
            if (Num>Temp){ // if the number entered is greater than that entered in
                Temp=Num; // precedence update the variable of the temporary number
            }        
        System.out.println("The largest number typed is "+Temp);
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