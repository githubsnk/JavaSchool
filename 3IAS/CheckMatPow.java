package JavaSchool;
import java.util.*;

/* 
Calculate the square of a number by adding the first N odd numbers.
Examples: 4 ** 2 = 1 + 3 + 5 + 7; 6 ** 2 = 1 + 3 + 5 + 7 + 9 + 11.
Check numerically if the technique is valid for the first 1000 integers
*/

public class CheckMatPow {
    public static void main (String[]args){ 
    Scanner scn = new Scanner(System.in);
    int Num=0, Sum=0;
        // I insert in num a num from 1 to 1000 ascending order
        for (int i=1; i<=1000; i++){
            // I raise to the power of 2 and put in Num
            Num=(int) Math.pow(i,2);
            // gate sum otherwise it also adds those of the previous for
            Sum=0;
            // iteration to add only N odd numbers contained between 0 and Num
            for (int I=1; I<=i+i; I++){
                if (I%2==1){                                  
                    Sum=Sum+I;
                    }
                }
            if (Sum==Num){
                System.out.println(""+i+"²= "+Num+" || Odd: "+Sum);
            }
            else{
                System.out.println(""+i+"²= "+Num+" || Odd: "+Sum+" ERROR!!!");
            }
        }
        System.out.println("     W O R K S !!!");
        scn.close();
    }
}

