package JavaSchool;
import java.util.*;
/*
Write an algorithm that, upon receipt of a positive integer, communicates whether the number:
a. is divisible by 5
b. is divisible by 7

*/
public class DivisibleNumber {
    
    public static void main(String args[]){
    Scanner Scn = new Scanner(System.in);
    int Number;
    String Quit="";

    do{
        System.out.println("Enter a number..");
        Number = Scn.nextInt();
        if (Number%5==0)
        System.out.println(Number + " is divisible by 5");
            
        if (Number%7==0) 
        System.out.println(Number + " is divisible by 7");
        else 
        System.out.println(Number + " is not divisible by 5 or 7");
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