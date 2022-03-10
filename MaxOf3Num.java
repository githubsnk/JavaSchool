package JavaSchool;
import java.util.*;
/*
Develop an algorithm to read three numbers and write the largest one out.
*/
public class MaxOf3Num {
    public static void main(String[] args) { 
    Scanner Scn = new Scanner(System.in);

    int Num1, Num2, Num3;
    String Quit="";

    do{
        System.out.println("enter a total of 3 numbers by pressing the enter key after writing the number");

        Num1= Scn.nextInt();
        Num2= Scn.nextInt();
        Num3= Scn.nextInt();

        if (Num1>Num2 && Num2>Num3){
            System.out.println("The biggest is "+Num1);
        }
            else if (Num2>Num1 && Num1>Num3)
            {
                System.out.println("The biggest is "+Num2);
            }
                else {
                    System.out.println("The biggest is "+Num3);
                }
            Scn.close();  
    /* I ask for an input to ask whether to repeat the execution of the program again
            or finish */        
            System.out.println(" ");
            System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
            Quit= Scn.next().toLowerCase();            
            System.out.println("-------------------------------------------------------------------");   
        
    }   while (!(Quit.equals("q")));  
         
    }
       
}