package JavaSchool;
import java.util.*;

/*-------------------Instructions-----------------------------------
Read two integers and display the integers
included between the minor and the major (inclusive). Assume that
the first number is less than the second (i.e. they are already in
ascending order). (Example: 3 5 -> 3, 4, 5). Display only
numbers divisible by 4 or 5 (use the% operator - remainder
of the whole division. Example: 14% 4 -> 2).

Pseudocode
Begin
    int Num1, Num2, 
    write("Enter the firs number")
    Num1=<--
    write("Enter the second number")
    Num2=<--
    
    If IsNot(Num1 > Num2)
        Int Temporary=Num2
        Num2=Num1
        Num1=Temporary
    End If

    For (I=Num2 To Num1)
        if (i%4==0||i%5==0)
        write(I)
        End If
    End For
*/

public class DivBy4Or5 {
    public static void main (String[]args){
        int Num1, Num2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the firs number");
        Num1= scn.nextInt();
        System.out.println("Enter the second number");
        Num2= scn.nextInt();
        
        if (!(Num1 > Num2)){ // the first number entered must be larger than the second
            int Temporary=Num2; // if not, I exchange the two numbers
            Num2=Num1;
            Num1=Temporary;
        }
        
        System.out.print("Here are the numbers contained between the two numbers you typed: ");
    
        for (int i=Num2; i<=Num1; i++){
            if (i%4==0||i%5==0){ // if one of the numbers enclosed in the range between Num1 and 
            System.out.print(i+",");// Num2 is divisible by 4 or by 5 show the number.
            }
        }
        scn.close();
    }
}