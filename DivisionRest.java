package JavaSchool;
import java.util.*;
/* ------------------------Instructions-----------------------------------------------------------
Develop an algorithm that reads two integers, and outputs the remainder of the division
integer of the first number for the second. Examples: 8 3> 2; 4 6> 4
Use only the + and - operators.

Pseudocode
Begin
    Int Num1, Num2, TempRest, Rest;
    write("Enter the first number and the second number separated by the enter key..")
    Num1=<-- 
    Num2=<-- 
    TempRest=Num1-Num2
    if (Num1<Num2)
        Rest=Num1    
    else
        while (TempRest>=0){
            Rest=TempRest;
            TempRest=TempRest-Num2;
        End While                
    End If
    write("Rest "+Rest);
    write("Check with Rest function "+Num1%Num2);
End
*/
public class DivisionRest {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        String Quit="";
        
        do{    int Num1, Num2, TempRest=0, Rest=0;
            System.out.println("Enter the first number and the second number separated by the enter key..");
            Num1= Scn.nextInt();        
            Num2= Scn.nextInt();
            TempRest=Num1-Num2;  
            if (Num1<Num2){
                Rest=Num1;
            }
            else{
                while (TempRest>=0){
                    Rest=TempRest;
                    TempRest=TempRest-Num2;
                }                 
            }
            System.out.println("Rest "+Rest);
            System.out.println("Check with Rest function "+Num1%Num2);
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
