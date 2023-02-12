package JavaSchool;
import java.util.*;
/*
Code a program that reads 10 numbers to the user and indicates how many times the numbers 3 or 5 have been entered.
Example: 2 3 9 5 7 5 8 6 4 2 -> 3
*/

public class Num3And5 {
    public static void main (String[]args){ 
        Scanner Scn =new Scanner(System.in);
        int Num=0,Sum=0; String Quit="";
        do{ Sum=0;
            for (int i=1; i<=10;i++){
            System.out.println("Enter the "+ i +" ° "+" number");
            Num= Scn.nextInt();
            if (Num==3||Num==5){// if it is equal to 3 or 5
                Sum=Sum+1; // count it
            }
        }
        System.out.println("The numbers 3 and 5 have been typed "+ Sum +" times");
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
