package JavaSchool;
import java.util.*;
/* ----------------------------------------PseudoCode---------------------------------------------------------------------
Read a sequence of integers, until the new number read is less than the previous one, and write the sum
(excluding the last one).
Example: 3 3 5 6 4 -> 17

Begin
    int Num, Output, TempNum;
    Boolean On;
    
    Write("Enter the number separated by the enter key")
    While (On==True)
        Num=<--    
        If (Num<TempNum&&(!(TempNum==0))) 
            On=False           
            Write("Numbers sum "Somma)
        else
            TempNum=Num
            Somma=Somma+Num
        End if
    End While
End     
*/
public class SumIncrSeq {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
    
        int Num=0, Somma=0, TempNum=0;
        boolean On=true;

        System.out.println("Enter the number separated by the enter key");    

        while (On){        
        Num=scn.nextInt();
            
            if (Num<TempNum&&(!(TempNum==0))){ // if a smaller number has been entered 
                On=false;     // than the last typed, and is non-zero
                System.out.println("Numbers sum: "+Somma);
            }
           else{               // if the number entered is increasing than
                TempNum=Num;    // at the last typed
                Somma=Somma+Num;
            }
        }
        scn.close();      
    }
}
