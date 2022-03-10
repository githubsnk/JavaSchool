package JavaSchool;
import java.util.*;
/*------------------------------Instructions---------------------------------------
Read 20 Numbers and see the difference between the sum of the odd and even Numbers.
Hint: 5% 2 -> 1 (Odd); 8% 2 -> 0 (Even).
*/
public class EvenOddNumbers {
    public static void main (String[]args){ 
        Scanner Scn = new Scanner(System.in);
        int Num=0,Even=0, Odd=0;
        String Quit="";

        do{
            for (int i=1; i<=20;i++){
                System.out.println("Enter the "+ i +" ° "+" Number");
                Num= Scn.nextInt();
                if (Num%2==0){ 
                    Even=Even+1;
                }
                else{
                    Odd=Odd+1;
                }
            }
            System.out.println("the difference between the Even and Odd Numbers is "+(Even-Odd));
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
