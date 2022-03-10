package JavaSchool;
/***************************Instructions:***********************************
Develop an algorithm that does multiplication using only mathematical operators
"+" and "-".
To do this we need to use a for loop.
*******************************************************************************/
import java.util.*;
public class MultiplicationWithFor{
  public static void main (String[]args){
   Scanner Scn = new Scanner(System.in);
   String Quit="";

  do{  int k=0, Op1=0, Op2=0;

    System.out.println("Enter the first operator and the second operator separated by the enter key");
    Op1= Scn.nextInt();
    Op2= Scn.nextInt();

        // here I check the "+" or "-" of the two numbers in input
        if (Op2<0||Op2<0&&Op1<0){// if Op2 is negative or if both Op2 and Op1 are negative
          Op2=-Op2;// I transform Op2 into its opposite
          Op1=-Op1;// I transform Op1 into its opposite
        }    

        // here add the "Multiplying" by a number of times equal to the "Multiplier"
        for (int i=1;i<=Op2;i++){
          k=k+Op1;
        }
        
        System.out.println("The result of the product is: ");
        System.out.println(k);
      /* I ask for an input to ask whether to repeat the execution of the program again
      or finish */        
      System.out.println(" ");
      System.out.println("To continue digit any key or to exit digit 'q' and then press enter"); 
      Quit= Scn.next().toLowerCase();            
      System.out.println("-------------------------------------------------------------------");   
    } while (!(Quit.equals("q")));  
  Scn.close();
    }
}




