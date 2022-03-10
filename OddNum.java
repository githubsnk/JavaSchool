package JavaSchool;
import java.util.*;
/* -----------------------------------Instructions----------------------------------------------------
Develop an algorithm that reads an indefinite number of numeric values ​​from the user, terminated by the number 0,
and returns the minimum value.
The zero therefore serves to signal the end of the numbers, and should not be considered as data.

Pseudocode
Begin
    Int End,Num,NumUser
    while (!(End==0)){
        write("write a number, to finish enter 0 and press enter.");
        NumUser= <-- Input

        if (NumUser==0)
            End=0
            NumUser=Num
        else if (NumUser<Num||Num==0)
            Num=NumUser;
        End If
    End While
    
    write("The smallest number typed is "+Num);

*/
public class OddNum {
  public static void main(String[] args) {
    Scanner Scn= new Scanner(System.in);
    int End=1,Num=0, NumUser=0; String Quit="";
    

    do{ Num=0;
        while (!(End==0)){
            System.out.println("write a number, to finish enter 0 and press enter.");
            NumUser= Scn.nextInt();
            
            if (NumUser==0){
                End=0;
                NumUser=Num;
            }
            else if (NumUser<Num||Num==0){
                Num=NumUser;
            }  
        }
        System.out.println("The smallest number typed is "+Num);
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