package JavaSchool;
import java.util.*;
/* --------------------------------------------------------PseudoCode----------------------------------------------------------------
OPTIONAL: Modify the SumSeqCresc exercise so that it calculates the Sum of increasing numbers separately, and the Sum of
decreasing numbers.
The program must end when the two sums are equal.
If the user enters two consecutive equal numbers, the second is ignored.
The program communicates the value of the Sum.
Example: 1 3 2 1 7 7 6 2 STOP (1 + 3 + 7) = (2 + 1 + 6 + 2)

Begin
   int Num, Sum, TempNum, MinSum;
        boolean On;

        Write("enter the number separated by the enter key");    

        while (On==True){        
        Num=<--
            
            if (Num<TempNum&&(!(TempNum==0))) //if a smaller number has been entered
                TempNum=Num    // than the last typed, and is non-zero
                MinSum=MinSum+Num
                        
            else               // if the number entered is increasing than
                TempNum=Num    // last entered or is the first number entered
                Sum=Sum+Num
            
            if (Sum==MinSum&&(!(Sum==0))) // If the sums of both minors and majors are equal
                Write("Numbers sum "+Sum)
                On=false
            }
        }
End     
*/
public class SumIncrDecrSeq {
    public static void main(String args[]){
        Scanner Scn = new Scanner(System.in);
        String Quit="";
        do{
            int Num, Sum=0, TempNum=0, MinSum=0;
            
            System.out.println("enter the number separated by the enter key");    

            while (!(Sum==MinSum&&(!(Sum==0)))){
            Num=Scn.nextInt();
                
                if (Num<TempNum&&(!(TempNum==0))){ //if a smaller number has been entered
                    TempNum=Num;     // than the last typed, and is non-zero
                    MinSum=MinSum+Num;
                }            
                else{               // if the number entered is increasing than
                    TempNum=Num;    // last entered or is the first number entered
                    Sum=Sum+Num;
                }           
            }
            System.out.print("Numbers sum "+Sum);
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
